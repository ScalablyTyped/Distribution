organization := "org.scalablytyped"
name := "sc-framework-health-check"
version := "2.0-dt-20200205Z-9eacc1"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "async" % "3.2-dt-20200515Z-6fd56a",
  "org.scalablytyped" %%% "async-iterable-stream" % "3.0-dt-20200205Z-574aa7",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-5329e6",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20200515Z-4db3c4",
  "org.scalablytyped" %%% "consumable-stream" % "1.0-dt-20200205Z-e5a4b4",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-d8ed07",
  "org.scalablytyped" %%% "express" % "4.17-dt-20200515Z-9eb2b7",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200515Z-c2bfc2",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-4658ca",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.5-dt-20200513Z-88793d",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20200515Z-593c89",
  "org.scalablytyped" %%% "ncom" % "1.0-dt-20200205Z-f2af9b",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200521Z-3aabb7",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20200519Z-7ad812",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-cd197c",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20200407Z-633f3f",
  "org.scalablytyped" %%% "sc-broker" % "8.0-dt-20200519Z-7e1092",
  "org.scalablytyped" %%% "sc-broker-cluster" % "9.0-dt-20200205Z-b688dd",
  "org.scalablytyped" %%% "sc-channel" % "2.0-dt-20200205Z-2638e2",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20200519Z-9da187",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20200205Z-7fe55a",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb",
  "org.scalablytyped" %%% "stream-demux" % "7.0-dt-20200205Z-6f74a2",
  "org.scalablytyped" %%% "writable-consumable-stream" % "1.1-dt-20200205Z-268d7f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
