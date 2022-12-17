organization := "org.scalablytyped"
name := "prosemirror-dev-tools"
version := "3.0-dt-20221026Z-64c76c"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "orderedmap" % "2.1.0-14eceb",
  "org.scalablytyped" %%% "prosemirror-model" % "1.18.2-77e6f3",
  "org.scalablytyped" %%% "prosemirror-state" % "1.4.2-7a4f6e",
  "org.scalablytyped" %%% "prosemirror-transform" % "1.7.0-52af59",
  "org.scalablytyped" %%% "prosemirror-view" % "1.29.1-92e490",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
