organization := "org.scalablytyped"
name := "prosemirror-state"
version := "1.4.1-93b669"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "orderedmap" % "2.0.0-8d46bb",
  "org.scalablytyped" %%% "prosemirror-model" % "1.18.1-285b58",
  "org.scalablytyped" %%% "prosemirror-transform" % "1.7.0-b9bbdf",
  "org.scalablytyped" %%% "prosemirror-view" % "1.28.0-cc92c2",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
