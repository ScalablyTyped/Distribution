organization := "org.scalablytyped"
name := "sc-channel"
version := "2.0-dt-20211202Z-6fd0c5"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "async-iterable-stream" % "3.0-dt-20211202Z-c871ca",
  "org.scalablytyped" %%% "consumable-stream" % "2.0-dt-20220215Z-d52362",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "stream-demux" % "8.0-dt-20220215Z-c2f347",
  "org.scalablytyped" %%% "writable-consumable-stream" % "2.0-dt-20220215Z-7a96b8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
