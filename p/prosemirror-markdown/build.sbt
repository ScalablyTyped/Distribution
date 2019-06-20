organization := "org.scalablytyped"
name := "prosemirror-markdown"
version := "1.0-dt-20181102Z-77e6e0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "linkify-it" % "2.1.0-dt-20190326Z-e968f7",
  "org.scalablytyped" %%% "markdown-it" % "0.0-unknown-dt-20190322Z-e87cec",
  "org.scalablytyped" %%% "orderedmap" % "1.0-dt-20180214Z-022cc6",
  "org.scalablytyped" %%% "prosemirror-model" % "1.7-dt-20190520Z-c4c6a2",
  "org.scalablytyped" %%% "std" % "3.5-d4a303")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        