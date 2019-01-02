organization := "org.scalablytyped"
name := "prosemirror-menu"
version := "1.0-dt-20180420Z-1868af"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "orderedmap" % "1.0-dt-20180214Z-57fcda",
  "org.scalablytyped" %%% "prosemirror-model" % "1.5-dt-20180621Z-e1ff56",
  "org.scalablytyped" %%% "prosemirror-state" % "1.2-dt-20180621Z-46c7c3",
  "org.scalablytyped" %%% "prosemirror-transform" % "1.1-dt-20180621Z-3173c6",
  "org.scalablytyped" %%% "prosemirror-view" % "1.3-dt-20180621Z-8dd21f",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        