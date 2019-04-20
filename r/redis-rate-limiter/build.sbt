organization := "org.scalablytyped"
name := "redis-rate-limiter"
version := "1.2-dt-20190212Z-3c2cbe"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-0aa3ae",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-17767a",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-f9a52b",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190318Z-a993f8",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-b7b3da",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190419Z-3f0246",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c3b9c7",
  "org.scalablytyped" %%% "redis" % "2.8-dt-20190326Z-d2a4cd",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-bad4a0",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        