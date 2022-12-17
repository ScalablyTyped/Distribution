organization := "org.scalablytyped"
name := "socketcluster-client"
version := "16.0-dt-20220215Z-5378e3"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ag-channel" % "5.0-dt-20220215Z-a02933",
  "org.scalablytyped" %%% "ag-simple-broker" % "5.0-dt-20220215Z-05b8c3",
  "org.scalablytyped" %%% "async-stream-emitter" % "4.0-dt-20220215Z-020668",
  "org.scalablytyped" %%% "consumable-stream" % "2.0-dt-20220215Z-42311c",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.5-dt-20220824Z-c593ce",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "sc-errors" % "1.4-dt-20211202Z-797848",
  "org.scalablytyped" %%% "socketcluster-server" % "16.1-dt-20220215Z-c5e928",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "stream-demux" % "8.0-dt-20220215Z-0f6dbb",
  "org.scalablytyped" %%% "writable-consumable-stream" % "2.0-dt-20220215Z-526f34",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-3574d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
