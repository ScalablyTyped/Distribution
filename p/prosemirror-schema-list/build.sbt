organization := "com.scalablytyped"
name := "prosemirror-schema-list"
version := "1.0-dt-20181018Z-cbfb04"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "orderedmap" % "1.0-dt-20180910Z-563101",
  "com.scalablytyped" %%% "prosemirror-model" % "1.5-dt-20180910Z-ef44df",
  "com.scalablytyped" %%% "prosemirror-state" % "1.2-dt-20180910Z-f8bc84",
  "com.scalablytyped" %%% "prosemirror-transform" % "1.1-dt-20180910Z-f9439d",
  "com.scalablytyped" %%% "prosemirror-view" % "1.3-dt-20180910Z-939b11",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        