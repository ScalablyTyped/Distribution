organization := "org.scalablytyped"
name := "prosemirror-schema-list"
version := "1.2.2-0eebbf"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "orderedmap" % "2.1.0-0355e8",
  "org.scalablytyped" %%% "prosemirror-model" % "1.18.1-e14a12",
  "org.scalablytyped" %%% "prosemirror-state" % "1.4.2-f8c589",
  "org.scalablytyped" %%% "prosemirror-transform" % "1.7.0-61076b",
  "org.scalablytyped" %%% "prosemirror-view" % "1.29.0-c0d3dd",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
