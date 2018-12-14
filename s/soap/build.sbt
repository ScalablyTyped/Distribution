organization := "org.scalablytyped"
name := "soap"
version := "0.25.0-b81a7d"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181214Z-e561d3",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180910Z-4e4989",
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180910Z-29ee10",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-c10888",
  "org.scalablytyped" %%% "ejs" % "2.6-dt-20181203Z-9100af",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180910Z-ec2aeb",
  "org.scalablytyped" %%% "finalhandler" % "0.0-unknown-dt-20180927Z-3f0213",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181120Z-909c16",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-93340d",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180910Z-08f14a",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-21ad57",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181208Z-85fa0c",
  "org.scalablytyped" %%% "request" % "2.48-dt-20181105Z-27ad3c",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180910Z-6f06eb",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180910Z-06fcdd",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "strip-bom" % "3.0-dt-20180910Z-69aea1",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181104Z-ecb515",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180910Z-6fbd33")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        