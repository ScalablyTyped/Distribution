organization := "org.scalablytyped"
name := "prosemirror-dropcursor"
version := "1.0-dt-20180917Z-2d34dd"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "orderedmap" % "1.0-dt-20180214Z-dfcb54",
  "org.scalablytyped" %%% "prosemirror-model" % "1.7-dt-20190130Z-2d0189",
  "org.scalablytyped" %%% "prosemirror-state" % "1.2-dt-20190222Z-894d39",
  "org.scalablytyped" %%% "prosemirror-transform" % "1.1-dt-20180621Z-7291cf",
  "org.scalablytyped" %%% "prosemirror-view" % "1.3-dt-20190222Z-0aacc4",
  "org.scalablytyped" %%% "std" % "3.3-6e4388")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        