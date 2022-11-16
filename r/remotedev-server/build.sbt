organization := "org.scalablytyped"
name := "remotedev-server"
version := "0.3-dt-20211202Z-1d8330"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ag-channel" % "5.0-dt-20220215Z-2ed9ca",
  "org.scalablytyped" %%% "ag-simple-broker" % "5.0-dt-20220215Z-47cc9e",
  "org.scalablytyped" %%% "async" % "3.2-dt-20220706Z-d0f634",
  "org.scalablytyped" %%% "async-iterable-stream" % "3.0-dt-20211202Z-9cf710",
  "org.scalablytyped" %%% "async-stream-emitter" % "4.0-dt-20220215Z-64f987",
  "org.scalablytyped" %%% "consumable-stream" % "2.0-dt-20220215Z-4d3c8d",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20211202Z-3765f3",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20211202Z-4a4465",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.5-dt-20220824Z-b73df8",
  "org.scalablytyped" %%% "ncom" % "1.0-dt-20211202Z-4b1daf",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20211202Z-ae9831",
  "org.scalablytyped" %%% "sc-broker" % "8.0-dt-20211202Z-b7f418",
  "org.scalablytyped" %%% "sc-broker-cluster" % "9.0-dt-20211202Z-b711fc",
  "org.scalablytyped" %%% "sc-channel" % "2.0-dt-20211202Z-eb4bce",
  "org.scalablytyped" %%% "sc-errors" % "1.4-dt-20211202Z-d97d9a",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20211202Z-197dd8",
  "org.scalablytyped" %%% "socketcluster-server" % "16.1-dt-20220215Z-5c9d3a",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "stream-demux" % "8.0-dt-20220215Z-1a55dd",
  "org.scalablytyped" %%% "writable-consumable-stream" % "2.0-dt-20220215Z-ec692a",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-0611bd")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
