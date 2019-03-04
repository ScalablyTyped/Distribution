organization := "org.scalablytyped"
name := "prosemirror-inputrules"
version := "1.0-dt-20180504Z-18b18d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "orderedmap" % "1.0-dt-20180214Z-75b74f",
  "org.scalablytyped" %%% "prosemirror-model" % "1.7-dt-20190130Z-d5cd65",
  "org.scalablytyped" %%% "prosemirror-state" % "1.2-dt-20190222Z-4684c1",
  "org.scalablytyped" %%% "prosemirror-transform" % "1.1-dt-20180621Z-dab08a",
  "org.scalablytyped" %%% "prosemirror-view" % "1.3-dt-20190222Z-9979d8",
  "org.scalablytyped" %%% "std" % "3.3-05be79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        