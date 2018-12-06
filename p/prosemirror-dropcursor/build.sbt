organization := "org.scalablytyped"
name := "prosemirror-dropcursor"
version := "1.0-dt-20180918Z-b58fc7"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "orderedmap" % "1.0-dt-20180910Z-694a21",
  "org.scalablytyped" %%% "prosemirror-model" % "1.5-dt-20180910Z-57a12f",
  "org.scalablytyped" %%% "prosemirror-state" % "1.2-dt-20180910Z-ff076c",
  "org.scalablytyped" %%% "prosemirror-transform" % "1.1-dt-20180910Z-021057",
  "org.scalablytyped" %%% "prosemirror-view" % "1.3-dt-20180910Z-f27321",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        