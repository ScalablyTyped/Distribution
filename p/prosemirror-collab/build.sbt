organization := "org.scalablytyped"
name := "prosemirror-collab"
version := "1.1-dt-20220624Z-9664e6"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "orderedmap" % "2.0.0-f28543",
  "org.scalablytyped" %%% "prosemirror-model" % "1.18.1-7c8582",
  "org.scalablytyped" %%% "prosemirror-state" % "1.4.1-edf8d1",
  "org.scalablytyped" %%% "prosemirror-transform" % "1.7.0-feb635",
  "org.scalablytyped" %%% "prosemirror-view" % "1.28.0-a7412d",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
