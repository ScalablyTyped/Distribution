organization := "org.scalablytyped"
name := "sc-framework-health-check"
version := "2.0-dt-20181218Z-05a762"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-0873eb",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-d0697e",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-d62561",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-cfce5e",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20190304Z-89b494",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-fcf6a3",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190311Z-8b4969",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-5082d0",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-a2a62b",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-ac5a09",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20190212Z-1c204f",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        