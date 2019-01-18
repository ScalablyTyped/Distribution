organization := "org.scalablytyped"
name := "prosemirror-schema-list"
version := "1.0-dt-20181017Z-61bbda"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "orderedmap" % "1.0-dt-20180214Z-cd3605",
  "org.scalablytyped" %%% "prosemirror-model" % "1.5-dt-20180621Z-d4d168",
  "org.scalablytyped" %%% "prosemirror-state" % "1.2-dt-20180621Z-422918",
  "org.scalablytyped" %%% "prosemirror-transform" % "1.1-dt-20180621Z-7d98ea",
  "org.scalablytyped" %%% "prosemirror-view" % "1.3-dt-20180621Z-ce1c5b",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        