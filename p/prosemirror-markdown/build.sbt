organization := "org.scalablytyped"
name := "prosemirror-markdown"
version := "1.0-dt-20190822Z-891b19"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "linkify-it" % "2.1.0-dt-20190326Z-937895",
  "org.scalablytyped" %%% "markdown-it" % "0.0-unknown-dt-20190925Z-a43774",
  "org.scalablytyped" %%% "orderedmap" % "1.0-dt-20180214Z-32536a",
  "org.scalablytyped" %%% "prosemirror-model" % "1.7-dt-20190628Z-67d59a",
  "org.scalablytyped" %%% "std" % "3.7-953338")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        