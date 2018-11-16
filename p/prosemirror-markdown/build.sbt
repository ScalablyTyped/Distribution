organization := "com.scalablytyped"
name := "prosemirror-markdown"
version := "1.0-dt-20181102Z-a0760a"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "linkify-it" % "2.0.3-dt-20181102Z-792ca5",
  "com.scalablytyped" %%% "markdown-it" % "0.0-unknown-dt-20181102Z-705c96",
  "com.scalablytyped" %%% "orderedmap" % "1.0-dt-20181102Z-0ca7c3",
  "com.scalablytyped" %%% "prosemirror-model" % "1.5-dt-20181102Z-dea61c",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        