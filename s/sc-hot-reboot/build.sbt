organization := "org.scalablytyped"
name := "sc-hot-reboot"
version := "1.0-dt-20211202Z-fbdc8c"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ag-channel" % "5.0-dt-20220215Z-79181f",
  "org.scalablytyped" %%% "ag-simple-broker" % "5.0-dt-20220215Z-06b5c1",
  "org.scalablytyped" %%% "anymatch" % "3.1.2-408111",
  "org.scalablytyped" %%% "async" % "3.2-dt-20220706Z-a561f7",
  "org.scalablytyped" %%% "async-iterable-stream" % "3.0-dt-20211202Z-ff943e",
  "org.scalablytyped" %%% "async-stream-emitter" % "4.0-dt-20220215Z-d105bf",
  "org.scalablytyped" %%% "chokidar" % "3.5.3-979bf8",
  "org.scalablytyped" %%% "consumable-stream" % "2.0-dt-20220215Z-2f8fc2",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20211202Z-bef5ba",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20211202Z-e7a898",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.5-dt-20220824Z-bceeaa",
  "org.scalablytyped" %%% "ncom" % "1.0-dt-20211202Z-f4647b",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221018Z-1e532a",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20211202Z-5ff874",
  "org.scalablytyped" %%% "sc-broker" % "8.0-dt-20211202Z-ae7941",
  "org.scalablytyped" %%% "sc-broker-cluster" % "9.0-dt-20211202Z-e19ad5",
  "org.scalablytyped" %%% "sc-channel" % "2.0-dt-20211202Z-3803cb",
  "org.scalablytyped" %%% "sc-errors" % "1.4-dt-20211202Z-a6b7ed",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20211202Z-1aa83b",
  "org.scalablytyped" %%% "socketcluster-server" % "16.1-dt-20220215Z-376316",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "stream-demux" % "8.0-dt-20220215Z-86ccce",
  "org.scalablytyped" %%% "writable-consumable-stream" % "2.0-dt-20220215Z-7edd1b",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-0f048d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
