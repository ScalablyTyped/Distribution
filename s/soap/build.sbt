organization := "com.scalablytyped"
name := "soap"
version := "0.25.0-a5b66f"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "bluebird" % "3.5-dt-20180910Z-3124ce",
  "com.scalablytyped" %%% "caseless" % "0.12-dt-20180910Z-7ce57e",
  "com.scalablytyped" %%% "concat-stream" % "1.6-dt-20180910Z-483dcb",
  "com.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-8c87a5",
  "com.scalablytyped" %%% "ejs" % "2.6-dt-20180910Z-9bb5f1",
  "com.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180910Z-43b19a",
  "com.scalablytyped" %%% "finalhandler" % "0.0-unknown-dt-20180927Z-8f307a",
  "com.scalablytyped" %%% "form-data" % "2.2-dt-20181120Z-d9baa6",
  "com.scalablytyped" %%% "lodash" % "4.14-dt-20181105Z-caf0c5",
  "com.scalablytyped" %%% "mime" % "2.0-dt-20180910Z-f9ab87",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-cadd20",
  "com.scalablytyped" %%% "range-parser" % "1.2-dt-20180910Z-dfa7aa",
  "com.scalablytyped" %%% "request" % "2.48-dt-20181105Z-33e3b0",
  "com.scalablytyped" %%% "sax" % "1.x-dt-20180910Z-498ca7",
  "com.scalablytyped" %%% "serve-static" % "1.13-dt-20180910Z-5d47cf",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "strip-bom" % "3.0-dt-20180910Z-f4c1c5",
  "com.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181104Z-a9e24d",
  "com.scalablytyped" %%% "uuid" % "3.4-dt-20180910Z-95c0d9",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        