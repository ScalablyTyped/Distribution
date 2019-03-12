organization := "org.scalablytyped"
name := "prosemirror-keymap"
version := "1.0-dt-20180420Z-cbe810"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "orderedmap" % "1.0-dt-20180214Z-58ee2e",
  "org.scalablytyped" %%% "prosemirror-model" % "1.7-dt-20190130Z-e86c2a",
  "org.scalablytyped" %%% "prosemirror-state" % "1.2-dt-20190222Z-2eeb05",
  "org.scalablytyped" %%% "prosemirror-transform" % "1.1-dt-20180621Z-5359d7",
  "org.scalablytyped" %%% "prosemirror-view" % "1.3-dt-20190222Z-6f6f34",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        