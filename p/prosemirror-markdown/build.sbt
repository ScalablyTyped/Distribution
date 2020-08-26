organization := "org.scalablytyped"
name := "prosemirror-markdown"
version := "1.0-dt-20200515Z-d82dc3"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "linkify-it" % "2.1.0-dt-20200515Z-8a2dfa",
  "org.scalablytyped" %%% "markdown-it" % "v10.0.0-dt-20200426Z-0bd627",
  "org.scalablytyped" %%% "mdurl" % "1.0-dt-20200515Z-2d3c9b",
  "org.scalablytyped" %%% "orderedmap" % "1.0-dt-20200515Z-b91949",
  "org.scalablytyped" %%% "prosemirror-model" % "1.7-dt-20200515Z-f7d868",
  "org.scalablytyped" %%% "std" % "3.9-bafc13")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
