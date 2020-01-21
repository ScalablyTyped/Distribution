organization := "org.scalablytyped"
name := "prosemirror-tables"
version := "0.9.5-07d0fd"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "orderedmap" % "1.0-dt-20180214Z-ef6457",
  "org.scalablytyped" %%% "prosemirror-model" % "1.7-dt-20190628Z-3aa3a1",
  "org.scalablytyped" %%% "prosemirror-state" % "1.2-dt-20190222Z-e59a08",
  "org.scalablytyped" %%% "prosemirror-transform" % "1.1-dt-20191101Z-a8c275",
  "org.scalablytyped" %%% "prosemirror-view" % "1.11-dt-20190930Z-8e50f3",
  "org.scalablytyped" %%% "std" % "3.7-96076c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        