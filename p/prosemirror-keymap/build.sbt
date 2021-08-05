organization := "org.scalablytyped"
name := "prosemirror-keymap"
version := "1.0-dt-20200710Z-f19f84"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "orderedmap" % "1.0-dt-20200515Z-4bd551",
  "org.scalablytyped" %%% "prosemirror-commands" % "1.0-dt-20200710Z-814eba",
  "org.scalablytyped" %%% "prosemirror-model" % "1.11-dt-20201109Z-a1debb",
  "org.scalablytyped" %%% "prosemirror-state" % "1.2-dt-20201002Z-2d9dd3",
  "org.scalablytyped" %%% "prosemirror-transform" % "1.1-dt-20191101Z-0ec266",
  "org.scalablytyped" %%% "prosemirror-view" % "1.16-dt-20201015Z-ab8d9a",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
