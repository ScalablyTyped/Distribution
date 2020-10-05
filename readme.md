

# ScalablyTyped - The Javascript ecosystem for Scala.js!

[![Join the chat at https://gitter.im/ScalablyTyped/community](https://badges.gitter.im/ScalablyTyped/community.svg)](https://gitter.im/ScalablyTyped/community)
[![Checkout the demos at https://github.com/ScalablyTyped/ScalablyTypedDemos/](https://img.shields.io/badge/Checkout-Demo-success.svg)](https://github.com/oyvindberg/ScalablyTypedDemos/)

This is the home of pre-built Scala.js typings for **174** Javascript libraries,
 which should span more or less the entire set of modern and popular libraries.

## Warning :collision: :bomb: :sunglasses:

These pre-built typing libraries are now **deprecated**.
Please see [scalablytyped.org](https://scalablytyped.org) for the shiny new sbt plugin.

Because of storage reasons the published libraries here **will be deleted** after a while.
Use the plugin for stable builds.

Currently all published artifacts are Scala 2.13 / Scala.js 1.x .
Use the plugin for older/newer versions of either.

If you want to keep exactly what you used before, remember that this is open source.
All the typing libraries come with build.sbt files, so you can clone the repo,
checkout the commit from the date of the distribution you are using,
 and change/build/publish the libraries.

## About

This is one of the biggest Scala repos on the planet:
```

--------------------------------------------------------------------------------
 Language             Files        Lines        Blank      Comment         Code
--------------------------------------------------------------------------------
 Scala               404260     21851613      1802095      4058170     15991348
 Markdown              9449       336115       111703            0       224412
 Makefile                 5           89           17            0           72
 HTML                     1            6            0            0            6
 JSON                     1            1            0            0            1
--------------------------------------------------------------------------------
 Total               413716     22187824      1913815      4058170     16215839
--------------------------------------------------------------------------------

```


## How can i get started with the distribution?

The Distribution also uses an sbt plugin, but just for keeping track of versions.
For historic reasons, it's called `sbt-scalablytyped.

Outside of that it's recommended to use sbt with [scalajs-bundler](https://scalacenter.github.io/scalajs-bundler/).

These should be the main steps you would have to follow:

### `project/plugins.sbt`
ScalablyTyped is hosted at bintray, so make sure to include the resolver
```scala
  resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
  addSbtPlugin("org.scalablytyped" % "sbt-scalablytyped" % "202010061228")
  // If you're still on Scala.js 0.6, this is the last distribution release.
  addSbtPlugin("org.scalablytyped" % "sbt-scalablytyped" % "202004200703")
```

### `build.sbt`
```scala
  /* reference the typing library */
  libraryDependencies ++= Seq(ScalablyTyped.D.d3),
  /* If the library is typed up in `DefinitelyTyped` (has `-dt-` in the version string) you'll also need this.
   * The reason why is that versions strings there are just comments, and frequently wrong. Automatically including
   *  that would break your build.
   */
  npmDependencies in Compile ++= Seq("d3" -> "5.5.0"),
```
The version of the typing normally includes the relevant version of the library,
 so you can often "go to definition" and see what you should put in `npmDependencies`.

The sbt plugin itself is nothing except for a bunch of versions guaranteed to be in sync
```scala
object D {
  val d3 = "org.scalablytyped" % "d3_sjs0.6_2.12" % "5.0-dt-20181018Z-171237"
  val `d3-array` = "org.scalablytyped" % "d3-array_sjs0.6_2.12" % "1.2-dt-20181018Z-e09a78"
  // ...
}
```
### Code away
After that you should be good to go and start coding:
```scala
  import typings.std.console
  console.warn("Hello, World!")
```

