organization := "org.scalablytyped"
name := "socketcluster-server"
version := "16.1-dt-20220215Z-7f9169"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ag-channel" % "5.0-dt-20220215Z-a94ce9",
  "org.scalablytyped" %%% "ag-simple-broker" % "5.0-dt-20220215Z-0b3e9e",
  "org.scalablytyped" %%% "async-stream-emitter" % "4.0-dt-20220215Z-cf9b27",
  "org.scalablytyped" %%% "consumable-stream" % "2.0-dt-20220215Z-d52362",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.5-dt-20220824Z-2d28cd",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "sc-errors" % "1.4-dt-20211202Z-611eb2",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "stream-demux" % "8.0-dt-20220215Z-c2f347",
  "org.scalablytyped" %%% "writable-consumable-stream" % "2.0-dt-20220215Z-7a96b8",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-142b86")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
