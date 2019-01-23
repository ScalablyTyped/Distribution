organization := "org.scalablytyped"
name := "soap"
version := "0.25.0-e0414e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-232ecf",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-ac9f89",
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180214Z-88f17d",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-3f5e62",
  "org.scalablytyped" %%% "ejs" % "2.6-dt-20181126Z-6afd7b",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-eee1c1",
  "org.scalablytyped" %%% "finalhandler" % "0.0-unknown-dt-20180924Z-a448ed",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-0051a6",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190116Z-c48db4",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-2342ad",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-7438ae",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-a57469",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-0bc71a",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180616Z-2af35f",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-f9c9b0",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "strip-bom" % "3.0-dt-20180214Z-a3f0cb",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-4d2fe4",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-f35d60")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        