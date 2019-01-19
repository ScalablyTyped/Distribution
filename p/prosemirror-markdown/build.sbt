organization := "org.scalablytyped"
name := "prosemirror-markdown"
version := "1.0-dt-20181102Z-234754"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "linkify-it" % "2.0.3-dt-20181017Z-42c20a",
  "org.scalablytyped" %%% "markdown-it" % "0.0-unknown-dt-20181102Z-5dc6ec",
  "org.scalablytyped" %%% "orderedmap" % "1.0-dt-20180214Z-cd3605",
  "org.scalablytyped" %%% "prosemirror-model" % "1.5-dt-20190116Z-6ea611",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        