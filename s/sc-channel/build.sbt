organization := "org.scalablytyped"
name := "sc-channel"
version := "2.0-dt-20211202Z-982202"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "async-iterable-stream" % "3.0-dt-20211202Z-329706",
  "org.scalablytyped" %%% "consumable-stream" % "2.0-dt-20220215Z-8fb2b2",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "stream-demux" % "8.0-dt-20220215Z-e10c4b",
  "org.scalablytyped" %%% "writable-consumable-stream" % "2.0-dt-20220215Z-cdee41")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
