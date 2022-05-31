organization := "org.scalablytyped"
name := "prosemirror-keymap"
version := "1.0-dt-20200710Z-94fa6f"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "orderedmap" % "1.0-dt-20200515Z-4bd551",
  "org.scalablytyped" %%% "prosemirror-commands" % "1.0-dt-20200710Z-58dfa5",
  "org.scalablytyped" %%% "prosemirror-model" % "1.11-dt-20201109Z-8b49cb",
  "org.scalablytyped" %%% "prosemirror-state" % "1.2-dt-20201002Z-8d6ff1",
  "org.scalablytyped" %%% "prosemirror-transform" % "1.1-dt-20191101Z-c3143b",
  "org.scalablytyped" %%% "prosemirror-view" % "1.16-dt-20201015Z-b8cd4f",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
