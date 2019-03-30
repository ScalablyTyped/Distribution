organization := "org.scalablytyped"
name := "soap"
version := "0.26.0-856ba5"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-986805",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-67548d",
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180214Z-b8125e",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190328Z-74c562",
  "org.scalablytyped" %%% "ejs" % "2.6-dt-20190223Z-2916f6",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190318Z-faea1f",
  "org.scalablytyped" %%% "finalhandler" % "0.0-unknown-dt-20190322Z-4899c6",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-3bb744",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190329Z-69a948",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-2631f3",
  "org.scalablytyped" %%% "node" % "11.12-dt-20190330Z-e2b8de",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-623d43",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-da2822",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20190322Z-da2201",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-dd9008",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "strip-bom" % "3.0-dt-20180214Z-e6e6e2",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-972cef",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-6fb7ef")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        