organization := "org.scalablytyped"
name := "prosemirror-tables"
version := "0.1-dt-20180420Z-36da04"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "orderedmap" % "1.0-dt-20180214Z-276335",
  "org.scalablytyped" %%% "prosemirror-model" % "1.7-dt-20190130Z-9ca417",
  "org.scalablytyped" %%% "prosemirror-state" % "1.2-dt-20190116Z-40d571",
  "org.scalablytyped" %%% "prosemirror-transform" % "1.1-dt-20180621Z-9c7a7c",
  "org.scalablytyped" %%% "prosemirror-view" % "1.3-dt-20180621Z-120e8d",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        