organization := "org.scalablytyped"
name := "prosemirror-dropcursor"
version := "1.0-dt-20180917Z-f77df9"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "orderedmap" % "1.0-dt-20180214Z-84b9e9",
  "org.scalablytyped" %%% "prosemirror-model" % "1.7-dt-20190628Z-4e07c4",
  "org.scalablytyped" %%% "prosemirror-state" % "1.2-dt-20190222Z-c5225c",
  "org.scalablytyped" %%% "prosemirror-transform" % "1.1-dt-20180621Z-091709",
  "org.scalablytyped" %%% "prosemirror-view" % "1.11-dt-20190930Z-282184",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        