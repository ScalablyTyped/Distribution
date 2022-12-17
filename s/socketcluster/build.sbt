organization := "org.scalablytyped"
name := "socketcluster"
version := "14.0-dt-20211202Z-60fabb"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ag-channel" % "5.0-dt-20220215Z-a02933",
  "org.scalablytyped" %%% "ag-simple-broker" % "5.0-dt-20220215Z-05b8c3",
  "org.scalablytyped" %%% "async" % "3.2-dt-20220706Z-8777de",
  "org.scalablytyped" %%% "async-iterable-stream" % "3.0-dt-20211202Z-e393b8",
  "org.scalablytyped" %%% "async-stream-emitter" % "4.0-dt-20220215Z-020668",
  "org.scalablytyped" %%% "consumable-stream" % "2.0-dt-20220215Z-42311c",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20211202Z-4b45e9",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20211202Z-1c9a00",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.5-dt-20220824Z-c593ce",
  "org.scalablytyped" %%% "ncom" % "1.0-dt-20211202Z-9dcb35",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20211202Z-41cd47",
  "org.scalablytyped" %%% "sc-broker" % "8.0-dt-20211202Z-2b3e4c",
  "org.scalablytyped" %%% "sc-broker-cluster" % "9.0-dt-20211202Z-be4ddc",
  "org.scalablytyped" %%% "sc-channel" % "2.0-dt-20211202Z-a962f3",
  "org.scalablytyped" %%% "sc-errors" % "1.4-dt-20211202Z-797848",
  "org.scalablytyped" %%% "socketcluster-server" % "16.1-dt-20220215Z-c5e928",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "stream-demux" % "8.0-dt-20220215Z-0f6dbb",
  "org.scalablytyped" %%% "writable-consumable-stream" % "2.0-dt-20220215Z-526f34",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-3574d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
