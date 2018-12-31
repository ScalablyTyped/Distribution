organization := "org.scalablytyped"
name := "soap"
version := "0.25.0-fee71a"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-03fd26",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-d86840",
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180214Z-f43a18",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-2025c9",
  "org.scalablytyped" %%% "ejs" % "2.6-dt-20181126Z-9c0a3f",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180604Z-e60b5f",
  "org.scalablytyped" %%% "finalhandler" % "0.0-unknown-dt-20180924Z-7af4ec",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-e0579d",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-0a02fb",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-b5dce1",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-77ce7e",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-5932ee",
  "org.scalablytyped" %%% "request" % "2.48-dt-20181105Z-2a9ed6",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180616Z-dc40c5",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-d30fee",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff",
  "org.scalablytyped" %%% "strip-bom" % "3.0-dt-20180214Z-c05a04",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181015Z-a8bc3f",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-34dde2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        