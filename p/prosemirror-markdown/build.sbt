organization := "org.scalablytyped"
name := "prosemirror-markdown"
version := "1.5-dt-20220319Z-b8f299"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "linkify-it" % "3.0.2-dt-20220818Z-b3fe5a",
  "org.scalablytyped" %%% "markdown-it" % "12.2-dt-20211202Z-400589",
  "org.scalablytyped" %%% "mdurl" % "1.0-dt-20211202Z-848948",
  "org.scalablytyped" %%% "orderedmap" % "2.0.0-7b2f87",
  "org.scalablytyped" %%% "prosemirror-model" % "1.18.1-5dc06b",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
