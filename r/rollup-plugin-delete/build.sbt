organization := "org.scalablytyped"
name := "rollup-plugin-delete"
version := "1.0.0-8247cb"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "del" % "5.0.0-bd3071",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20190322Z-f5e4db",
  "org.scalablytyped" %%% "fast-glob" % "3.0.4-2bcc2d",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-046942",
  "org.scalablytyped" %%% "globby" % "10.0.1-8a6e90",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-41d0ad",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190709Z-570c89",
  "org.scalablytyped" %%% "nodelib__fs_dot_scandir" % "2.1.1-643cc9",
  "org.scalablytyped" %%% "nodelib__fs_dot_stat" % "2.0.1-d834af",
  "org.scalablytyped" %%% "nodelib__fs_dot_walk" % "1.2.2-0ba4f5",
  "org.scalablytyped" %%% "rollup" % "1.16.7-dcdfae",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        