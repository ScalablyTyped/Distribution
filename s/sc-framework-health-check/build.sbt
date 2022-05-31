organization := "org.scalablytyped"
name := "sc-framework-health-check"
version := "2.0-dt-20200205Z-8455dc"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "async" % "3.2-dt-20201112Z-815dc0",
  "org.scalablytyped" %%% "async-iterable-stream" % "3.0-dt-20200205Z-ceb58b",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-ad3420",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20201002Z-4e45b6",
  "org.scalablytyped" %%% "consumable-stream" % "1.0-dt-20200205Z-ac51ea",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-c67fe2",
  "org.scalablytyped" %%% "express" % "4.17-dt-20201111Z-2d5437",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200921Z-44f8de",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-060171",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.5-dt-20200513Z-2b4a8f",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20200722Z-162477",
  "org.scalablytyped" %%% "ncom" % "1.0-dt-20200205Z-5ddc04",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-11c649",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20201002Z-64e6f9",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20201002Z-329d84",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20200407Z-6723b9",
  "org.scalablytyped" %%% "sc-broker" % "8.0-dt-20200519Z-c838ef",
  "org.scalablytyped" %%% "sc-broker-cluster" % "9.0-dt-20200205Z-a69740",
  "org.scalablytyped" %%% "sc-channel" % "2.0-dt-20200205Z-191f74",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20201117Z-bcf4d7",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20200205Z-d13eda",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab",
  "org.scalablytyped" %%% "stream-demux" % "7.0-dt-20200902Z-769aed",
  "org.scalablytyped" %%% "writable-consumable-stream" % "1.1-dt-20200205Z-84cce4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
