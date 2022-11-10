organization := "org.scalablytyped"
name := "sc-channel"
version := "2.0-dt-20211202Z-05f9ab"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "async-iterable-stream" % "3.0-dt-20211202Z-5e9414",
  "org.scalablytyped" %%% "consumable-stream" % "2.0-dt-20220215Z-e0ce1a",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "stream-demux" % "8.0-dt-20220215Z-57aa1e",
  "org.scalablytyped" %%% "writable-consumable-stream" % "2.0-dt-20220215Z-c98c56")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
