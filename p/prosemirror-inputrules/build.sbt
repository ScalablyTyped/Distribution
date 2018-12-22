organization := "org.scalablytyped"
name := "prosemirror-inputrules"
version := "1.0-dt-20180504Z-643017"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "orderedmap" % "1.0-dt-20180214Z-e8ef6a",
  "org.scalablytyped" %%% "prosemirror-model" % "1.5-dt-20180621Z-4dd5fc",
  "org.scalablytyped" %%% "prosemirror-state" % "1.2-dt-20180621Z-26254b",
  "org.scalablytyped" %%% "prosemirror-transform" % "1.1-dt-20180621Z-78d6fe",
  "org.scalablytyped" %%% "prosemirror-view" % "1.3-dt-20180621Z-e0fde5",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        