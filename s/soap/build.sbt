organization := "org.scalablytyped"
name := "soap"
version := "0.26.0-6e2012"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-cbbf17",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-708eba",
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180214Z-64cdac",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-779d70",
  "org.scalablytyped" %%% "ejs" % "2.6-dt-20190223Z-2ce286",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-15274d",
  "org.scalablytyped" %%% "finalhandler" % "0.0-unknown-dt-20180924Z-1934d5",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-8bf542",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-f3a537",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-1dd39e",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-bb7734",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-1e193b",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-972449",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180616Z-d7f378",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-ae1f71",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "strip-bom" % "3.0-dt-20180214Z-7d8ee8",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-62e3dd",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-c29a23")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        