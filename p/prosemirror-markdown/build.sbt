organization := "org.scalablytyped"
name := "prosemirror-markdown"
version := "1.0-dt-20181104Z-2b8299"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "linkify-it" % "2.0.3-dt-20181018Z-1b7243",
  "org.scalablytyped" %%% "markdown-it" % "0.0-unknown-dt-20181104Z-cfc3fc",
  "org.scalablytyped" %%% "orderedmap" % "1.0-dt-20180910Z-cab48a",
  "org.scalablytyped" %%% "prosemirror-model" % "1.5-dt-20180910Z-dce970",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        