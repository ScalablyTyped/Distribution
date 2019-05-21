organization := "org.scalablytyped"
name := "prosemirror-commands"
version := "1.0-dt-20180420Z-49794e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "orderedmap" % "1.0-dt-20180214Z-a9a4b7",
  "org.scalablytyped" %%% "prosemirror-model" % "1.7-dt-20190520Z-d4a427",
  "org.scalablytyped" %%% "prosemirror-state" % "1.2-dt-20190222Z-bfc5d7",
  "org.scalablytyped" %%% "prosemirror-transform" % "1.1-dt-20180621Z-7460b7",
  "org.scalablytyped" %%% "prosemirror-view" % "1.3-dt-20190520Z-eb5b35",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        