organization := "org.scalablytyped"
name := "prosemirror-state"
version := "1.4.2-cac392"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "orderedmap" % "2.1.0-0355e8",
  "org.scalablytyped" %%% "prosemirror-model" % "1.18.1-e14a12",
  "org.scalablytyped" %%% "prosemirror-transform" % "1.7.0-61076b",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
