organization := "org.scalablytyped"
name := "sc-framework-health-check"
version := "2.0-dt-20181218Z-aa75fb"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-cbd349",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20180414Z-8e8731",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-fc559d",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-593054",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-12a485",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20181101Z-8a76ef",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-54d3f4",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190206Z-9f73ab",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c7c39d",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-0c5946",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-ed7327",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20181218Z-38d9fa",
  "org.scalablytyped" %%% "socketcluster-server" % "14.2-dt-20190129Z-878096",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-734b83")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        