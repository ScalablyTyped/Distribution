organization := "org.scalablytyped"
name := "read-config-file"
version := "3.2.1-f9d7a9"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ajv" % "6.7.0-3699e1",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-a8dc26",
  "org.scalablytyped" %%% "bluebird-lst" % "1.0.6-86df11",
  "org.scalablytyped" %%% "dotenv" % "6.1-dt-20181101Z-4d2dff",
  "org.scalablytyped" %%% "dotenv-expand" % "4.2.0-52ab1b",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-ceddfc",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-c8d4b8",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20180706Z-3bc3c3",
  "org.scalablytyped" %%% "fs-extra-p" % "7.0.0-24020e",
  "org.scalablytyped" %%% "js-yaml" % "3.12-dt-20190118Z-8bc5c9",
  "org.scalablytyped" %%% "json5" % "0.0-unknown-dt-20180813Z-8c7f39",
  "org.scalablytyped" %%% "lazy-val" % "1.0.3-b9e391",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-7438ae",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-6755f9",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-c4241a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        