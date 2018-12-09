organization := "org.scalablytyped"
name := "prosemirror-inputrules"
version := "1.0-dt-20180910Z-a0e1bc"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "orderedmap" % "1.0-dt-20180910Z-54733a",
  "org.scalablytyped" %%% "prosemirror-model" % "1.5-dt-20180910Z-4af2f3",
  "org.scalablytyped" %%% "prosemirror-state" % "1.2-dt-20180910Z-0afbbc",
  "org.scalablytyped" %%% "prosemirror-transform" % "1.1-dt-20180910Z-f9a06b",
  "org.scalablytyped" %%% "prosemirror-view" % "1.3-dt-20180910Z-c0e36c",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        