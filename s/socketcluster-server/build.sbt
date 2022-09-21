organization := "org.scalablytyped"
name := "socketcluster-server"
version := "16.1-dt-20220215Z-7375f2"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ag-channel" % "5.0-dt-20220215Z-a8a40c",
  "org.scalablytyped" %%% "ag-simple-broker" % "5.0-dt-20220215Z-d2b984",
  "org.scalablytyped" %%% "async-stream-emitter" % "4.0-dt-20220215Z-ff89ba",
  "org.scalablytyped" %%% "consumable-stream" % "2.0-dt-20220215Z-192e95",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.5-dt-20220824Z-f22f85",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "sc-errors" % "1.4-dt-20211202Z-3beab8",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "stream-demux" % "8.0-dt-20220215Z-ae5686",
  "org.scalablytyped" %%% "writable-consumable-stream" % "2.0-dt-20220215Z-ea95fb",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-6883ea")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
