organization := "org.scalablytyped"
name := "soap"
version := "0.25.0-6a998d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-a33d29",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-b68dab",
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180214Z-ca3d5f",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-7e0ea5",
  "org.scalablytyped" %%% "ejs" % "2.6-dt-20181126Z-f7656e",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180604Z-afbe4d",
  "org.scalablytyped" %%% "finalhandler" % "0.0-unknown-dt-20180924Z-6756b0",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-9cf838",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-010a28",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-b17d95",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2aa425",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-13d69c",
  "org.scalablytyped" %%% "request" % "2.48-dt-20181105Z-a362a9",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180616Z-4d0b7b",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-3abc85",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98",
  "org.scalablytyped" %%% "strip-bom" % "3.0-dt-20180214Z-740ee0",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181015Z-b0f6d7",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-18a59e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        