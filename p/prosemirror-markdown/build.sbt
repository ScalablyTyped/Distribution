organization := "org.scalablytyped"
name := "prosemirror-markdown"
version := "1.0-dt-20190822Z-56476a"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "linkify-it" % "2.1.0-dt-20190326Z-53c2a7",
  "org.scalablytyped" %%% "markdown-it" % "0.0-unknown-dt-20190701Z-e30abd",
  "org.scalablytyped" %%% "orderedmap" % "1.0-dt-20180214Z-ba8c18",
  "org.scalablytyped" %%% "prosemirror-model" % "1.7-dt-20190628Z-4319e2",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        