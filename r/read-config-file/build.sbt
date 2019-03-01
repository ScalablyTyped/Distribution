organization := "org.scalablytyped"
name := "read-config-file"
version := "3.2.1-319619"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ajv" % "6.9.2-824407",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-cbbf17",
  "org.scalablytyped" %%% "bluebird-lst" % "1.0.7-8afb8f",
  "org.scalablytyped" %%% "dotenv" % "6.1-dt-20181101Z-dd0710",
  "org.scalablytyped" %%% "dotenv-expand" % "4.2.0-2ff259",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-598466",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-f61f0c",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20190212Z-881432",
  "org.scalablytyped" %%% "fs-extra-p" % "7.0.1-c815c8",
  "org.scalablytyped" %%% "js-yaml" % "3.12-dt-20190118Z-970eae",
  "org.scalablytyped" %%% "json5" % "0.0-unknown-dt-20180813Z-60893a",
  "org.scalablytyped" %%% "lazy-val" % "1.0.4-94d367",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-99335f",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-2503b8",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-4b6ee3")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        