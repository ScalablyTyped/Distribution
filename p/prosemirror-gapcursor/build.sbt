organization := "org.scalablytyped"
name := "prosemirror-gapcursor"
version := "1.0-dt-20180910Z-5615d0"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "orderedmap" % "1.0-dt-20180910Z-7059d1",
  "org.scalablytyped" %%% "prosemirror-model" % "1.5-dt-20180910Z-7aa275",
  "org.scalablytyped" %%% "prosemirror-state" % "1.2-dt-20180910Z-27a7a6",
  "org.scalablytyped" %%% "prosemirror-transform" % "1.1-dt-20180910Z-b6e64f",
  "org.scalablytyped" %%% "prosemirror-view" % "1.3-dt-20180910Z-873be0",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        