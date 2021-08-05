organization := "org.scalablytyped"
name := "scc-broker-client"
version := "7.0-dt-20200519Z-be5f97"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ag-channel" % "4.0-dt-20200205Z-2bafff",
  "org.scalablytyped" %%% "ag-simple-broker" % "4.0-dt-20200205Z-903f1e",
  "org.scalablytyped" %%% "async-stream-emitter" % "3.0-dt-20200902Z-1373c1",
  "org.scalablytyped" %%% "consumable-stream" % "1.0-dt-20200205Z-d470e7",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-a67397",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-f91099",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.5-dt-20200513Z-0d69c6",
  "org.scalablytyped" %%% "ncom" % "1.0-dt-20200205Z-d9c2f6",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20200407Z-9593ed",
  "org.scalablytyped" %%% "sc-broker" % "8.0-dt-20200519Z-18c748",
  "org.scalablytyped" %%% "sc-errors" % "1.4-dt-20200205Z-545b05",
  "org.scalablytyped" %%% "socketcluster-client" % "15.1-dt-20201028Z-dc77f8",
  "org.scalablytyped" %%% "socketcluster-server" % "15.0-dt-20200214Z-1cc599",
  "org.scalablytyped" %%% "std" % "4.1-2f6855",
  "org.scalablytyped" %%% "stream-demux" % "7.0-dt-20200902Z-2f5713",
  "org.scalablytyped" %%% "writable-consumable-stream" % "1.1-dt-20200205Z-a8f207",
  "org.scalablytyped" %%% "ws" % "7.4-dt-20201109Z-8b3f01")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
