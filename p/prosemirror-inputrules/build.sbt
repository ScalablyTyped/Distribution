organization := "org.scalablytyped"
name := "prosemirror-inputrules"
version := "1.0-dt-20180504Z-209f0d"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "orderedmap" % "1.0-dt-20180214Z-84b9e9",
  "org.scalablytyped" %%% "prosemirror-model" % "1.7-dt-20190628Z-f7d627",
  "org.scalablytyped" %%% "prosemirror-state" % "1.2-dt-20190222Z-00af49",
  "org.scalablytyped" %%% "prosemirror-transform" % "1.1-dt-20180621Z-4b386b",
  "org.scalablytyped" %%% "prosemirror-view" % "1.11-dt-20190930Z-8ce1f9",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        