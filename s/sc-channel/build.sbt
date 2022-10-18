organization := "org.scalablytyped"
name := "sc-channel"
version := "2.0-dt-20211202Z-3803cb"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "async-iterable-stream" % "3.0-dt-20211202Z-ff943e",
  "org.scalablytyped" %%% "consumable-stream" % "2.0-dt-20220215Z-2f8fc2",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "stream-demux" % "8.0-dt-20220215Z-86ccce",
  "org.scalablytyped" %%% "writable-consumable-stream" % "2.0-dt-20220215Z-7edd1b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
