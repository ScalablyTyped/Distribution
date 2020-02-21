organization := "org.scalablytyped"
name := "prosemirror-keymap"
version := "1.0-dt-20180420Z-f7901f"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "orderedmap" % "1.0-dt-20180214Z-1c1d85",
  "org.scalablytyped" %%% "prosemirror-model" % "1.7-dt-20190628Z-8b29b3",
  "org.scalablytyped" %%% "prosemirror-state" % "1.2-dt-20190222Z-8ac37f",
  "org.scalablytyped" %%% "prosemirror-transform" % "1.1-dt-20191101Z-2d6e8a",
  "org.scalablytyped" %%% "prosemirror-view" % "1.11-dt-20190930Z-4df030",
  "org.scalablytyped" %%% "std" % "3.7-1b8369")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
