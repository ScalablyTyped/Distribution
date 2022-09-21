organization := "org.scalablytyped"
name := "remotedev-server"
version := "0.3-dt-20211202Z-39e685"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ag-channel" % "5.0-dt-20220215Z-a8a40c",
  "org.scalablytyped" %%% "ag-simple-broker" % "5.0-dt-20220215Z-d2b984",
  "org.scalablytyped" %%% "async" % "3.2-dt-20220706Z-2a5b17",
  "org.scalablytyped" %%% "async-iterable-stream" % "3.0-dt-20211202Z-c1a7f6",
  "org.scalablytyped" %%% "async-stream-emitter" % "4.0-dt-20220215Z-ff89ba",
  "org.scalablytyped" %%% "consumable-stream" % "2.0-dt-20220215Z-192e95",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20211202Z-9d51d8",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20211202Z-7870bd",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.5-dt-20220824Z-f22f85",
  "org.scalablytyped" %%% "ncom" % "1.0-dt-20211202Z-9ae977",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20211202Z-a0fcff",
  "org.scalablytyped" %%% "sc-broker" % "8.0-dt-20211202Z-ecf10f",
  "org.scalablytyped" %%% "sc-broker-cluster" % "9.0-dt-20211202Z-a4c3df",
  "org.scalablytyped" %%% "sc-channel" % "2.0-dt-20211202Z-577a8d",
  "org.scalablytyped" %%% "sc-errors" % "1.4-dt-20211202Z-3beab8",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20211202Z-24e157",
  "org.scalablytyped" %%% "socketcluster-server" % "16.1-dt-20220215Z-7375f2",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "stream-demux" % "8.0-dt-20220215Z-ae5686",
  "org.scalablytyped" %%% "writable-consumable-stream" % "2.0-dt-20220215Z-ea95fb",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-6883ea")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
