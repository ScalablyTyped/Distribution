organization := "org.scalablytyped"
name := "prosemirror-commands"
version := "1.0-dt-20180420Z-d90632"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "orderedmap" % "1.0-dt-20180214Z-022cc6",
  "org.scalablytyped" %%% "prosemirror-model" % "1.7-dt-20190520Z-f5b4f6",
  "org.scalablytyped" %%% "prosemirror-state" % "1.2-dt-20190222Z-2b3861",
  "org.scalablytyped" %%% "prosemirror-transform" % "1.1-dt-20180621Z-89a624",
  "org.scalablytyped" %%% "prosemirror-view" % "1.3-dt-20190520Z-6099c9",
  "org.scalablytyped" %%% "std" % "3.5-c5d119")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        