organization := "org.scalablytyped"
name := "soap"
version := "0.25.0-a42c17"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-ef7d03",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-0334cd",
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180214Z-7a79e2",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-0e2c03",
  "org.scalablytyped" %%% "ejs" % "2.6-dt-20181126Z-54a509",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-d79c77",
  "org.scalablytyped" %%% "finalhandler" % "0.0-unknown-dt-20180924Z-2b0c40",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-7c0763",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190116Z-e5b16b",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-5089c8",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-8da1df",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-145d73",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-c301e1",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180616Z-fdcda0",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-ff7651",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "strip-bom" % "3.0-dt-20180214Z-cdd6dc",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-3631a3",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-dbdaa1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        