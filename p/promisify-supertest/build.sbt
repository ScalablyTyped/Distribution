organization := "org.scalablytyped"
name := "promisify-supertest"
version := "v1.0.0-dt-20180214Z-0b2943"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-1ca7dd",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-c3324d",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20190116Z-7de85d",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-147e65",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-6ff32e",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-5cf9d4",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190302Z-6be09d",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-aeafd9",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-96e810",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20190226Z-a17ae4")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        