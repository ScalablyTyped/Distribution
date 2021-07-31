organization := "org.scalablytyped"
name := "sc-channel"
version := "2.0-dt-20200205Z-afc1b4"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "async-iterable-stream" % "3.0-dt-20200205Z-766947",
  "org.scalablytyped" %%% "consumable-stream" % "1.0-dt-20200205Z-cc8470",
  "org.scalablytyped" %%% "std" % "4.1-044efb",
  "org.scalablytyped" %%% "stream-demux" % "7.0-dt-20200902Z-724a0c",
  "org.scalablytyped" %%% "writable-consumable-stream" % "1.1-dt-20200205Z-1608e4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
