organization := "org.scalablytyped"
name := "scc-broker-client"
version := "8.0-dt-20220215Z-7f4218"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ag-channel" % "5.0-dt-20220215Z-15b87a",
  "org.scalablytyped" %%% "ag-simple-broker" % "5.0-dt-20220215Z-37e37b",
  "org.scalablytyped" %%% "async-stream-emitter" % "4.0-dt-20220215Z-e302a4",
  "org.scalablytyped" %%% "consumable-stream" % "2.0-dt-20220215Z-2d64d4",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20211202Z-11c16b",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20211202Z-ead772",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.5-dt-20220824Z-561f21",
  "org.scalablytyped" %%% "ncom" % "1.0-dt-20211202Z-ebf988",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221026Z-107efe",
  "org.scalablytyped" %%% "sc-broker" % "8.0-dt-20211202Z-2ce056",
  "org.scalablytyped" %%% "sc-errors" % "1.4-dt-20211202Z-b05182",
  "org.scalablytyped" %%% "socketcluster-client" % "16.0-dt-20220215Z-2a6373",
  "org.scalablytyped" %%% "socketcluster-server" % "16.1-dt-20220215Z-d640c0",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "stream-demux" % "8.0-dt-20220215Z-940a56",
  "org.scalablytyped" %%% "writable-consumable-stream" % "2.0-dt-20220215Z-7cb43e",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-2ad085")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
