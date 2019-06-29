organization := "org.scalablytyped"
name := "prosemirror-state"
version := "1.2-dt-20190222Z-5a39a8"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "orderedmap" % "1.0-dt-20180214Z-022cc6",
  "org.scalablytyped" %%% "prosemirror-model" % "1.7-dt-20190628Z-a7ba2e",
  "org.scalablytyped" %%% "prosemirror-transform" % "1.1-dt-20180621Z-e656ec",
  "org.scalablytyped" %%% "prosemirror-view" % "1.3-dt-20190520Z-ad880c",
  "org.scalablytyped" %%% "std" % "3.5-d4a303")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        