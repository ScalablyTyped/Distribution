organization := "org.scalablytyped"
name := "remotedev-server"
version := "0.3-dt-20200721Z-d2b4e1"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "async" % "3.2-dt-20201112Z-137c74",
  "org.scalablytyped" %%% "async-iterable-stream" % "3.0-dt-20200205Z-d48580",
  "org.scalablytyped" %%% "consumable-stream" % "1.0-dt-20200205Z-d470e7",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-a67397",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-f91099",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.5-dt-20200513Z-0d69c6",
  "org.scalablytyped" %%% "ncom" % "1.0-dt-20200205Z-d9c2f6",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20200407Z-9593ed",
  "org.scalablytyped" %%% "sc-broker" % "8.0-dt-20200519Z-18c748",
  "org.scalablytyped" %%% "sc-broker-cluster" % "9.0-dt-20200205Z-afd3a5",
  "org.scalablytyped" %%% "sc-channel" % "2.0-dt-20200205Z-83aae5",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20200205Z-6295cb",
  "org.scalablytyped" %%% "std" % "4.1-2f6855",
  "org.scalablytyped" %%% "stream-demux" % "7.0-dt-20200902Z-2f5713",
  "org.scalablytyped" %%% "writable-consumable-stream" % "1.1-dt-20200205Z-a8f207")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
