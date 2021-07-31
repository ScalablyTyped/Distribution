organization := "org.scalablytyped"
name := "socketcluster-client"
version := "15.1-dt-20201028Z-311641"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ag-channel" % "4.0-dt-20200205Z-23bc7f",
  "org.scalablytyped" %%% "ag-simple-broker" % "4.0-dt-20200205Z-b3fa0d",
  "org.scalablytyped" %%% "async-stream-emitter" % "3.0-dt-20200902Z-8d45e8",
  "org.scalablytyped" %%% "consumable-stream" % "1.0-dt-20200205Z-cc8470",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.5-dt-20200513Z-266be0",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20200407Z-924dba",
  "org.scalablytyped" %%% "sc-errors" % "1.4-dt-20200205Z-be5cb3",
  "org.scalablytyped" %%% "socketcluster-server" % "15.0-dt-20200214Z-aa3240",
  "org.scalablytyped" %%% "std" % "4.1-044efb",
  "org.scalablytyped" %%% "stream-demux" % "7.0-dt-20200902Z-724a0c",
  "org.scalablytyped" %%% "writable-consumable-stream" % "1.1-dt-20200205Z-1608e4",
  "org.scalablytyped" %%% "ws" % "7.4-dt-20201109Z-518f97")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
