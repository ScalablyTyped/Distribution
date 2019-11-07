organization := "org.scalablytyped"
name := "prosemirror-keymap"
version := "1.0-dt-20180420Z-3c45fd"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "orderedmap" % "1.0-dt-20180214Z-84b9e9",
  "org.scalablytyped" %%% "prosemirror-model" % "1.7-dt-20190628Z-370e76",
  "org.scalablytyped" %%% "prosemirror-state" % "1.2-dt-20190222Z-a091d6",
  "org.scalablytyped" %%% "prosemirror-transform" % "1.1-dt-20191101Z-4cedeb",
  "org.scalablytyped" %%% "prosemirror-view" % "1.11-dt-20190930Z-6bed91",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        