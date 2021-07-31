organization := "org.scalablytyped"
name := "sc-framework-health-check"
version := "2.0-dt-20200205Z-9790fc"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "async" % "3.2-dt-20201112Z-c0d7ca",
  "org.scalablytyped" %%% "async-iterable-stream" % "3.0-dt-20200205Z-766947",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-0ef592",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20201002Z-4b695b",
  "org.scalablytyped" %%% "consumable-stream" % "1.0-dt-20200205Z-cc8470",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-c64a85",
  "org.scalablytyped" %%% "express" % "4.17-dt-20201111Z-2f63a9",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200921Z-2cc92e",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-120917",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.5-dt-20200513Z-266be0",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20200722Z-35349b",
  "org.scalablytyped" %%% "ncom" % "1.0-dt-20200205Z-65d02a",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20201002Z-42be7a",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20201002Z-f5b664",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20200407Z-924dba",
  "org.scalablytyped" %%% "sc-broker" % "8.0-dt-20200519Z-35c5ee",
  "org.scalablytyped" %%% "sc-broker-cluster" % "9.0-dt-20200205Z-b1e929",
  "org.scalablytyped" %%% "sc-channel" % "2.0-dt-20200205Z-afc1b4",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20201117Z-f95694",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20200205Z-43ead3",
  "org.scalablytyped" %%% "std" % "4.1-044efb",
  "org.scalablytyped" %%% "stream-demux" % "7.0-dt-20200902Z-724a0c",
  "org.scalablytyped" %%% "writable-consumable-stream" % "1.1-dt-20200205Z-1608e4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
