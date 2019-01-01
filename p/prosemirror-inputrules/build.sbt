organization := "org.scalablytyped"
name := "prosemirror-inputrules"
version := "1.0-dt-20180504Z-045bfe"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "orderedmap" % "1.0-dt-20180214Z-57fcda",
  "org.scalablytyped" %%% "prosemirror-model" % "1.5-dt-20180621Z-e1ff56",
  "org.scalablytyped" %%% "prosemirror-state" % "1.2-dt-20180621Z-363a47",
  "org.scalablytyped" %%% "prosemirror-transform" % "1.1-dt-20180621Z-3173c6",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        