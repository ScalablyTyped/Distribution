organization := "com.scalablytyped"
name := "prosemirror-tables"
version := "0.1-dt-20180910Z-217731"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "orderedmap" % "1.0-dt-20180910Z-7aea0a",
  "com.scalablytyped" %%% "prosemirror-model" % "1.5-dt-20180910Z-d5d2f9",
  "com.scalablytyped" %%% "prosemirror-state" % "1.2-dt-20180910Z-966a5f",
  "com.scalablytyped" %%% "prosemirror-transform" % "1.1-dt-20180910Z-f68db3",
  "com.scalablytyped" %%% "prosemirror-view" % "1.3-dt-20180910Z-2f85ee",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        