organization := "org.scalablytyped"
name := "scc-broker-client"
version := "8.0-dt-20220215Z-134b7b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ag-channel" % "5.0-dt-20220215Z-b59ec6",
  "org.scalablytyped" %%% "ag-simple-broker" % "5.0-dt-20220215Z-573941",
  "org.scalablytyped" %%% "async-stream-emitter" % "4.0-dt-20220215Z-62a45e",
  "org.scalablytyped" %%% "consumable-stream" % "2.0-dt-20220215Z-8fb2b2",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20211202Z-80b886",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20211202Z-a804fc",
  "org.scalablytyped" %%% "jsonwebtoken" % "9.0-dt-20230427Z-0e0ab1",
  "org.scalablytyped" %%% "ncom" % "1.0-dt-20211202Z-75528c",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "sc-broker" % "8.0-dt-20211202Z-6c7759",
  "org.scalablytyped" %%% "sc-errors" % "1.4-dt-20211202Z-7a6ac9",
  "org.scalablytyped" %%% "socketcluster-client" % "16.0-dt-20220215Z-2ef597",
  "org.scalablytyped" %%% "socketcluster-server" % "17.3-dt-20230213Z-06ea33",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "stream-demux" % "8.0-dt-20220215Z-e10c4b",
  "org.scalablytyped" %%% "writable-consumable-stream" % "2.0-dt-20220215Z-cdee41",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20221230Z-6a0345")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
