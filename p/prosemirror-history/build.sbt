organization := "org.scalablytyped"
name := "prosemirror-history"
version := "1.0-dt-20180420Z-d1164e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "orderedmap" % "1.0-dt-20180214Z-fb9751",
  "org.scalablytyped" %%% "prosemirror-model" % "1.7-dt-20190130Z-bb9b53",
  "org.scalablytyped" %%% "prosemirror-state" % "1.2-dt-20190222Z-14f824",
  "org.scalablytyped" %%% "prosemirror-transform" % "1.1-dt-20180621Z-cb26f6",
  "org.scalablytyped" %%% "prosemirror-view" % "1.3-dt-20190222Z-12634a",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        