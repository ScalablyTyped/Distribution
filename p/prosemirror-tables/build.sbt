organization := "org.scalablytyped"
name := "prosemirror-tables"
version := "1.1.1-d8f503"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "orderedmap" % "1.0-dt-20200515Z-d5e107",
  "org.scalablytyped" %%% "prosemirror-model" % "1.11-dt-20201109Z-7cbb9c",
  "org.scalablytyped" %%% "prosemirror-state" % "1.2-dt-20201002Z-7aa66c",
  "org.scalablytyped" %%% "prosemirror-transform" % "1.1-dt-20191101Z-b319c6",
  "org.scalablytyped" %%% "prosemirror-view" % "1.16-dt-20201015Z-156e04",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
