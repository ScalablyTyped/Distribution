organization := "org.scalablytyped"
name := "prosemirror-history"
version := "1.3.0-d34785"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "orderedmap" % "2.1.0-4f004a",
  "org.scalablytyped" %%% "prosemirror-model" % "1.18.2-176545",
  "org.scalablytyped" %%% "prosemirror-state" % "1.4.2-b2ba20",
  "org.scalablytyped" %%% "prosemirror-transform" % "1.7.0-8c191a",
  "org.scalablytyped" %%% "prosemirror-view" % "1.29.1-834677",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
