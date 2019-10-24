organization := "org.scalablytyped"
name := "prosemirror-commands"
version := "1.0-dt-20180420Z-4ea4c9"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "orderedmap" % "1.0-dt-20180214Z-84b9e9",
  "org.scalablytyped" %%% "prosemirror-model" % "1.7-dt-20190628Z-85aee5",
  "org.scalablytyped" %%% "prosemirror-state" % "1.2-dt-20190222Z-204a67",
  "org.scalablytyped" %%% "prosemirror-transform" % "1.1-dt-20180621Z-bdaa78",
  "org.scalablytyped" %%% "prosemirror-view" % "1.11-dt-20190930Z-8c666e",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        