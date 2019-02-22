organization := "org.scalablytyped"
name := "soap"
version := "0.26.0-de438a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190221Z-f01776",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-bde245",
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180214Z-27dec7",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-c0f3d2",
  "org.scalablytyped" %%% "ejs" % "2.6-dt-20190212Z-945834",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-ab47ea",
  "org.scalablytyped" %%% "finalhandler" % "0.0-unknown-dt-20180924Z-aca11b",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-7ab4be",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-cf3a73",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-54d3f4",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190213Z-604ea6",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c7c39d",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-9b7291",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180616Z-d39187",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-fa6869",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "strip-bom" % "3.0-dt-20180214Z-8c4225",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-9af261",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-dd6701")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        