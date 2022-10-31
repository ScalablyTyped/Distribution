organization := "org.scalablytyped"
name := "socketcluster-client"
version := "16.0-dt-20220215Z-3dcb69"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ag-channel" % "5.0-dt-20220215Z-15b87a",
  "org.scalablytyped" %%% "ag-simple-broker" % "5.0-dt-20220215Z-37e37b",
  "org.scalablytyped" %%% "async-stream-emitter" % "4.0-dt-20220215Z-e302a4",
  "org.scalablytyped" %%% "consumable-stream" % "2.0-dt-20220215Z-2d64d4",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.5-dt-20220824Z-17d348",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221030Z-57fc1b",
  "org.scalablytyped" %%% "sc-errors" % "1.4-dt-20211202Z-b05182",
  "org.scalablytyped" %%% "socketcluster-server" % "16.1-dt-20220215Z-97f61b",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "stream-demux" % "8.0-dt-20220215Z-940a56",
  "org.scalablytyped" %%% "writable-consumable-stream" % "2.0-dt-20220215Z-7cb43e",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-cacb98")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
