organization := "org.scalablytyped"
name := "prosemirror-markdown"
version := "1.0-dt-20181102Z-e8966d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "linkify-it" % "2.1.0-dt-20190312Z-c708dd",
  "org.scalablytyped" %%% "markdown-it" % "0.0-unknown-dt-20190322Z-fac0d4",
  "org.scalablytyped" %%% "orderedmap" % "1.0-dt-20180214Z-58ee2e",
  "org.scalablytyped" %%% "prosemirror-model" % "1.7-dt-20190130Z-e86c2a",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        