organization := "org.scalablytyped"
name := "prosemirror-markdown"
version := "1.0-dt-20181102Z-9fd276"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "linkify-it" % "2.1.0-dt-20190326Z-4b0746",
  "org.scalablytyped" %%% "markdown-it" % "0.0-unknown-dt-20190322Z-e006eb",
  "org.scalablytyped" %%% "orderedmap" % "1.0-dt-20180214Z-a9a4b7",
  "org.scalablytyped" %%% "prosemirror-model" % "1.7-dt-20190130Z-d740c8",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        