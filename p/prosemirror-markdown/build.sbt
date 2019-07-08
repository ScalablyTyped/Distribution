organization := "org.scalablytyped"
name := "prosemirror-markdown"
version := "1.0-dt-20181102Z-1a2130"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "linkify-it" % "2.1.0-dt-20190326Z-c0b823",
  "org.scalablytyped" %%% "markdown-it" % "0.0-unknown-dt-20190701Z-cd07b2",
  "org.scalablytyped" %%% "orderedmap" % "1.0-dt-20180214Z-3ffdee",
  "org.scalablytyped" %%% "prosemirror-model" % "1.7-dt-20190628Z-499849",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        