organization := "org.scalablytyped"
name := "sc-channel"
version := "2.0-dt-20211202Z-577a8d"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "async-iterable-stream" % "3.0-dt-20211202Z-c1a7f6",
  "org.scalablytyped" %%% "consumable-stream" % "2.0-dt-20220215Z-192e95",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "stream-demux" % "8.0-dt-20220215Z-ae5686",
  "org.scalablytyped" %%% "writable-consumable-stream" % "2.0-dt-20220215Z-ea95fb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
