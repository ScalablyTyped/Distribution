organization := "org.scalablytyped"
name := "prosemirror-markdown"
version := "1.0-dt-20181102Z-14f92b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "linkify-it" % "2.1.0-dt-20190326Z-0cd545",
  "org.scalablytyped" %%% "markdown-it" % "0.0-unknown-dt-20190322Z-354981",
  "org.scalablytyped" %%% "orderedmap" % "1.0-dt-20180214Z-1490ac",
  "org.scalablytyped" %%% "prosemirror-model" % "1.7-dt-20190130Z-03de7b",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        