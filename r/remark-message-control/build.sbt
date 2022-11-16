organization := "org.scalablytyped"
name := "remark-message-control"
version := "7.1.1-b6c3d2"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "mdast" % "3.0-dt-20211202Z-627ab0",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "unified-message-control" % "4.0.0-f4ce78",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20220624Z-b11504",
  "org.scalablytyped" %%% "unist-util-is" % "5.1.1-b7c697",
  "org.scalablytyped" %%% "vfile" % "5.3.5-07532a",
  "org.scalablytyped" %%% "vfile-message" % "3.1.2-16f1d1")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
