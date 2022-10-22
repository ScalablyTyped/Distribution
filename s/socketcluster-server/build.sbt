organization := "org.scalablytyped"
name := "socketcluster-server"
version := "16.1-dt-20220215Z-62330d"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ag-channel" % "5.0-dt-20220215Z-79181f",
  "org.scalablytyped" %%% "ag-simple-broker" % "5.0-dt-20220215Z-06b5c1",
  "org.scalablytyped" %%% "async-stream-emitter" % "4.0-dt-20220215Z-d105bf",
  "org.scalablytyped" %%% "consumable-stream" % "2.0-dt-20220215Z-2f8fc2",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.5-dt-20220824Z-e81379",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "sc-errors" % "1.4-dt-20211202Z-a6b7ed",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "stream-demux" % "8.0-dt-20220215Z-86ccce",
  "org.scalablytyped" %%% "writable-consumable-stream" % "2.0-dt-20220215Z-7edd1b",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-a7f58f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
