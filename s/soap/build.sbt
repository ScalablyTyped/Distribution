organization := "org.scalablytyped"
name := "soap"
version := "0.26.0-088d73"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-865309",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-197130",
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180214Z-e12bf7",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-cd6676",
  "org.scalablytyped" %%% "ejs" % "2.6-dt-20190223Z-ba5715",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-2595ac",
  "org.scalablytyped" %%% "finalhandler" % "0.0-unknown-dt-20180924Z-a1175d",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-ffa40c",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-2e7712",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-5cf9d4",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-fd0a52",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-aeafd9",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-e9e8b4",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180616Z-404ef7",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-8d0e0b",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "strip-bom" % "3.0-dt-20180214Z-619428",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-3a715e",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-565676")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        