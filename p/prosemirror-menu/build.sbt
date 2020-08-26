organization := "org.scalablytyped"
name := "prosemirror-menu"
version := "1.0-dt-20200527Z-ed07a5"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "orderedmap" % "1.0-dt-20200515Z-b91949",
  "org.scalablytyped" %%% "prosemirror-model" % "1.7-dt-20200515Z-f7d868",
  "org.scalablytyped" %%% "prosemirror-state" % "1.2-dt-20200629Z-348a2f",
  "org.scalablytyped" %%% "prosemirror-transform" % "1.1-dt-20191101Z-02303d",
  "org.scalablytyped" %%% "prosemirror-view" % "1.15-dt-20200629Z-85fec1",
  "org.scalablytyped" %%% "std" % "3.9-bafc13")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
