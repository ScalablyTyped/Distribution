organization := "org.scalablytyped"
name := "prosemirror-gapcursor"
version := "1.0-dt-20180420Z-44aacf"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "orderedmap" % "1.0-dt-20180214Z-1490ac",
  "org.scalablytyped" %%% "prosemirror-model" % "1.7-dt-20190130Z-03de7b",
  "org.scalablytyped" %%% "prosemirror-state" % "1.2-dt-20190222Z-26e5df",
  "org.scalablytyped" %%% "prosemirror-transform" % "1.1-dt-20180621Z-11a4ca",
  "org.scalablytyped" %%% "prosemirror-view" % "1.3-dt-20190222Z-54ad02",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        