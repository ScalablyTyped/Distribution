organization := "org.scalablytyped"
name := "sc-framework-health-check"
version := "2.0-dt-20181218Z-1aed95"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-ab0cf8",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20190205Z-92ea0d",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-c1e1a0",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-3db512",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-aac9d7",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20181101Z-a349a5",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-1dd39e",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-99335f",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-1e193b",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-b46f0e",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-9be8ed",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20190212Z-f2d910",
  "org.scalablytyped" %%% "socketcluster-server" % "14.2-dt-20190205Z-0a3157",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-cace4b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        