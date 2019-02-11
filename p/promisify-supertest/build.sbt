organization := "org.scalablytyped"
name := "promisify-supertest"
version := "v1.0.0-dt-20180214Z-f1c17d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-82bef3",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-e6a834",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20190116Z-a37fdd",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-714bd6",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-4af3eb",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-54d3f4",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190206Z-3468e4",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c7c39d",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-6911a2",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "superagent" % "3.8-dt-20181230Z-0c9a4d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        