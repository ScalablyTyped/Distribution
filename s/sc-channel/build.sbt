organization := "org.scalablytyped"
name := "sc-channel"
version := "2.0-dt-20211202Z-eb4bce"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "async-iterable-stream" % "3.0-dt-20211202Z-9cf710",
  "org.scalablytyped" %%% "consumable-stream" % "2.0-dt-20220215Z-4d3c8d",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "stream-demux" % "8.0-dt-20220215Z-1a55dd",
  "org.scalablytyped" %%% "writable-consumable-stream" % "2.0-dt-20220215Z-ec692a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
