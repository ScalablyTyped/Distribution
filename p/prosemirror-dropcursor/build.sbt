organization := "org.scalablytyped"
name := "prosemirror-dropcursor"
version := "1.0-dt-20180917Z-be6664"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "orderedmap" % "1.0-dt-20180214Z-a9a4b7",
  "org.scalablytyped" %%% "prosemirror-model" % "1.7-dt-20190130Z-c1ef4d",
  "org.scalablytyped" %%% "prosemirror-state" % "1.2-dt-20190222Z-7f85fb",
  "org.scalablytyped" %%% "prosemirror-transform" % "1.1-dt-20180621Z-2fe215",
  "org.scalablytyped" %%% "prosemirror-view" % "1.3-dt-20190222Z-8f6f25",
  "org.scalablytyped" %%% "std" % "3.4-495f93")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        