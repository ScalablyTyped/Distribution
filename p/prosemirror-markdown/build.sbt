organization := "org.scalablytyped"
name := "prosemirror-markdown"
version := "1.5-dt-20220319Z-7e5c1a"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "linkify-it" % "3.0.2-dt-20220818Z-80d04d",
  "org.scalablytyped" %%% "markdown-it" % "12.2-dt-20211202Z-e8e55e",
  "org.scalablytyped" %%% "mdurl" % "1.0-dt-20211202Z-848948",
  "org.scalablytyped" %%% "orderedmap" % "2.0.0-290323",
  "org.scalablytyped" %%% "prosemirror-model" % "1.18.1-113445",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
