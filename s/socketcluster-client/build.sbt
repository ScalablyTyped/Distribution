organization := "org.scalablytyped"
name := "socketcluster-client"
version := "15.1-dt-20201028Z-9457dd"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ag-channel" % "4.0-dt-20200205Z-0c1420",
  "org.scalablytyped" %%% "ag-simple-broker" % "4.0-dt-20200205Z-7ab5ed",
  "org.scalablytyped" %%% "async-stream-emitter" % "3.0-dt-20200902Z-538fd7",
  "org.scalablytyped" %%% "consumable-stream" % "1.0-dt-20200205Z-ac51ea",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.5-dt-20200513Z-2b4a8f",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-11c649",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20200407Z-6723b9",
  "org.scalablytyped" %%% "sc-errors" % "1.4-dt-20200205Z-6603df",
  "org.scalablytyped" %%% "socketcluster-server" % "15.0-dt-20200214Z-5ee440",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab",
  "org.scalablytyped" %%% "stream-demux" % "7.0-dt-20200902Z-769aed",
  "org.scalablytyped" %%% "writable-consumable-stream" % "1.1-dt-20200205Z-84cce4",
  "org.scalablytyped" %%% "ws" % "7.4-dt-20201109Z-9be819")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
