organization := "org.scalablytyped"
name := "prosemirror-dropcursor"
version := "1.0-dt-20180918Z-2b5f99"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "orderedmap" % "1.0-dt-20180910Z-cab48a",
  "org.scalablytyped" %%% "prosemirror-model" % "1.5-dt-20180910Z-dce970",
  "org.scalablytyped" %%% "prosemirror-state" % "1.2-dt-20180910Z-0f2eb6",
  "org.scalablytyped" %%% "prosemirror-transform" % "1.1-dt-20180910Z-0cdd04",
  "org.scalablytyped" %%% "prosemirror-view" % "1.3-dt-20180910Z-8547b6",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        