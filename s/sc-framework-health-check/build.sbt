organization := "org.scalablytyped"
name := "sc-framework-health-check"
version := "2.0-dt-20200205Z-eda2a5"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "async" % "3.2-dt-20201112Z-43823a",
  "org.scalablytyped" %%% "async-iterable-stream" % "3.0-dt-20200205Z-d70564",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-210a9e",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20201002Z-9b0b3f",
  "org.scalablytyped" %%% "consumable-stream" % "1.0-dt-20200205Z-ec9d89",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-b5e59b",
  "org.scalablytyped" %%% "express" % "4.17-dt-20201111Z-2a8190",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200921Z-49f0c4",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-61a4ae",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.5-dt-20200513Z-aa4f2d",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20200722Z-901708",
  "org.scalablytyped" %%% "ncom" % "1.0-dt-20200205Z-174750",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-50d3d9",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20201002Z-f71cda",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20201002Z-cf0dc0",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20200407Z-81e63f",
  "org.scalablytyped" %%% "sc-broker" % "8.0-dt-20200519Z-fe4f5a",
  "org.scalablytyped" %%% "sc-broker-cluster" % "9.0-dt-20200205Z-16a02b",
  "org.scalablytyped" %%% "sc-channel" % "2.0-dt-20200205Z-2f29e2",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20201117Z-7640b4",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20200205Z-28bf51",
  "org.scalablytyped" %%% "std" % "4.1-40053c",
  "org.scalablytyped" %%% "stream-demux" % "7.0-dt-20200902Z-4f8e22",
  "org.scalablytyped" %%% "writable-consumable-stream" % "1.1-dt-20200205Z-c0bbb9")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
