organization := "org.scalablytyped"
name := "prosemirror-markdown"
version := "1.0-dt-20190822Z-ae01ea"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "linkify-it" % "2.1.0-dt-20190326Z-d6cda9",
  "org.scalablytyped" %%% "markdown-it" % "0.0-unknown-dt-20190925Z-14f2ed",
  "org.scalablytyped" %%% "orderedmap" % "1.0-dt-20180214Z-1c1d85",
  "org.scalablytyped" %%% "prosemirror-model" % "1.7-dt-20190628Z-8b29b3",
  "org.scalablytyped" %%% "std" % "3.7-1b8369")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
