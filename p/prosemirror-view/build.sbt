organization := "org.scalablytyped"
name := "prosemirror-view"
version := "1.28.0-604611"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "orderedmap" % "2.0.0-7b2f87",
  "org.scalablytyped" %%% "prosemirror-model" % "1.18.1-5dc06b",
  "org.scalablytyped" %%% "prosemirror-transform" % "1.7.0-b3c8df",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
