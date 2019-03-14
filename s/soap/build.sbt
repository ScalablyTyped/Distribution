organization := "org.scalablytyped"
name := "soap"
version := "0.26.0-39a04a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-cc7043",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-768261",
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180214Z-22becd",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-4b79e1",
  "org.scalablytyped" %%% "ejs" % "2.6-dt-20190223Z-c20989",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-02a1c5",
  "org.scalablytyped" %%% "finalhandler" % "0.0-unknown-dt-20180924Z-ea7dec",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-22d14e",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190311Z-601106",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-fcf6a3",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190313Z-f6d9fe",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-5082d0",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-ee9a54",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180616Z-05fa63",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-b44a76",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "strip-bom" % "3.0-dt-20180214Z-fb53e5",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-0cc572",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-40951d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        