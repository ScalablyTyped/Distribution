organization := "org.scalablytyped"
name := "prosemirror-view"
version := "1.29.1-2befe4"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "orderedmap" % "2.1.0-4a923a",
  "org.scalablytyped" %%% "prosemirror-model" % "1.18.2-b39084",
  "org.scalablytyped" %%% "prosemirror-state" % "1.4.2-0b4918",
  "org.scalablytyped" %%% "prosemirror-transform" % "1.7.0-a598d4",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
