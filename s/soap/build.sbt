organization := "org.scalablytyped"
name := "soap"
version := "0.25.0-b65087"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20180910Z-b88fdf",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180910Z-4e4989",
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180910Z-330eec",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-c10888",
  "org.scalablytyped" %%% "ejs" % "2.6-dt-20181203Z-9100af",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180910Z-a3aa42",
  "org.scalablytyped" %%% "finalhandler" % "0.0-unknown-dt-20180927Z-31507c",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181120Z-a7959e",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-93340d",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180910Z-08f14a",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181213Z-bd3349",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181208Z-85fa0c",
  "org.scalablytyped" %%% "request" % "2.48-dt-20181105Z-0007d0",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180910Z-126416",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180910Z-1add06",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "strip-bom" % "3.0-dt-20180910Z-69aea1",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181104Z-ecb515",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180910Z-6ad88a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        