organization := "org.scalablytyped"
name := "sc-framework-health-check"
version := "2.0-dt-20211202Z-e620b1"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ag-channel" % "5.0-dt-20220215Z-15b87a",
  "org.scalablytyped" %%% "ag-simple-broker" % "5.0-dt-20220215Z-37e37b",
  "org.scalablytyped" %%% "async" % "3.2-dt-20220706Z-ec37e8",
  "org.scalablytyped" %%% "async-iterable-stream" % "3.0-dt-20211202Z-2f1b29",
  "org.scalablytyped" %%% "async-stream-emitter" % "4.0-dt-20220215Z-e302a4",
  "org.scalablytyped" %%% "consumable-stream" % "2.0-dt-20220215Z-2d64d4",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20211202Z-11c16b",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-cbb6c3",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-035d9a",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20211202Z-ead772",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.5-dt-20220824Z-844797",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-3b1911",
  "org.scalablytyped" %%% "ncom" % "1.0-dt-20211202Z-5cbc24",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221024Z-2be228",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-33ed42",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20211202Z-0a2110",
  "org.scalablytyped" %%% "sc-broker" % "8.0-dt-20211202Z-b67523",
  "org.scalablytyped" %%% "sc-broker-cluster" % "9.0-dt-20211202Z-1556e7",
  "org.scalablytyped" %%% "sc-channel" % "2.0-dt-20211202Z-fcf6b5",
  "org.scalablytyped" %%% "sc-errors" % "1.4-dt-20211202Z-b05182",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-c7a026",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20211202Z-de8917",
  "org.scalablytyped" %%% "socketcluster-server" % "16.1-dt-20220215Z-a1f595",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "stream-demux" % "8.0-dt-20220215Z-940a56",
  "org.scalablytyped" %%% "writable-consumable-stream" % "2.0-dt-20220215Z-7cb43e",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-3e4a2a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
