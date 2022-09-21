organization := "org.scalablytyped"
name := "prosemirror-tables"
version := "1.2.5-191c91"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "orderedmap" % "2.0.0-290323",
  "org.scalablytyped" %%% "prosemirror-model" % "1.18.1-113445",
  "org.scalablytyped" %%% "prosemirror-state" % "1.4.1-165ae5",
  "org.scalablytyped" %%% "prosemirror-transform" % "1.7.0-835659",
  "org.scalablytyped" %%% "prosemirror-view" % "1.28.0-b7fada",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
