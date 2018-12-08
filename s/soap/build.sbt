organization := "org.scalablytyped"
name := "soap"
version := "0.25.0-5a08ec"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20180910Z-3eb23e",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180910Z-88463f",
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180910Z-189899",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-0c31be",
  "org.scalablytyped" %%% "ejs" % "2.6-dt-20181203Z-4b4913",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180910Z-b93914",
  "org.scalablytyped" %%% "finalhandler" % "0.0-unknown-dt-20180927Z-37b5a9",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181120Z-961b6c",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-3dc8be",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180910Z-399889",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-d9c01e",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181208Z-e9c641",
  "org.scalablytyped" %%% "request" % "2.48-dt-20181105Z-2b1e0f",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180910Z-fcb303",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180910Z-de6390",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b",
  "org.scalablytyped" %%% "strip-bom" % "3.0-dt-20180910Z-ac1118",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181104Z-171ce9",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180910Z-00c113")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        