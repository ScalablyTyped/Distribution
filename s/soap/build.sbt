organization := "org.scalablytyped"
name := "soap"
version := "0.25.0-a96fc6"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-6bd481",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-ca4bc1",
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180214Z-79d07a",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-315ade",
  "org.scalablytyped" %%% "ejs" % "2.6-dt-20181126Z-cec9a8",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180604Z-af1292",
  "org.scalablytyped" %%% "finalhandler" % "0.0-unknown-dt-20180924Z-31636e",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-efd843",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-5a27ec",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-6294fd",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2be335",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-d115b2",
  "org.scalablytyped" %%% "request" % "2.48-dt-20181105Z-d2b9fb",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180616Z-3eb7b5",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-91019c",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1",
  "org.scalablytyped" %%% "strip-bom" % "3.0-dt-20180214Z-3e667d",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181015Z-a404a3",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-7936ed")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        