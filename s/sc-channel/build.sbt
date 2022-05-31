organization := "org.scalablytyped"
name := "sc-channel"
version := "2.0-dt-20200205Z-191f74"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "async-iterable-stream" % "3.0-dt-20200205Z-ceb58b",
  "org.scalablytyped" %%% "consumable-stream" % "1.0-dt-20200205Z-ac51ea",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab",
  "org.scalablytyped" %%% "stream-demux" % "7.0-dt-20200902Z-769aed",
  "org.scalablytyped" %%% "writable-consumable-stream" % "1.1-dt-20200205Z-84cce4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
