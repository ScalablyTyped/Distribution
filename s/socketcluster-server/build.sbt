organization := "org.scalablytyped"
name := "socketcluster-server"
version := "16.1-dt-20220215Z-7d68c9"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ag-channel" % "5.0-dt-20220215Z-d15852",
  "org.scalablytyped" %%% "ag-simple-broker" % "5.0-dt-20220215Z-8c46b0",
  "org.scalablytyped" %%% "async-stream-emitter" % "4.0-dt-20220215Z-5aa9d3",
  "org.scalablytyped" %%% "consumable-stream" % "2.0-dt-20220215Z-e0ce1a",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.5-dt-20220824Z-832cde",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "sc-errors" % "1.4-dt-20211202Z-f264e4",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "stream-demux" % "8.0-dt-20220215Z-57aa1e",
  "org.scalablytyped" %%% "writable-consumable-stream" % "2.0-dt-20220215Z-c98c56",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-38b082")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
