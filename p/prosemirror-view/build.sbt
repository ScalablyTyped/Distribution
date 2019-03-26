organization := "org.scalablytyped"
name := "prosemirror-view"
version := "1.3-dt-20190222Z-67c79f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "orderedmap" % "1.0-dt-20180214Z-47d72b",
  "org.scalablytyped" %%% "prosemirror-model" % "1.7-dt-20190130Z-4c96c3",
  "org.scalablytyped" %%% "prosemirror-transform" % "1.1-dt-20180621Z-dd93cb",
  "org.scalablytyped" %%% "std" % "3.3-14e863")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        