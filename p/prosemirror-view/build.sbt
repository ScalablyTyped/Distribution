organization := "org.scalablytyped"
name := "prosemirror-view"
version := "1.15-dt-20200629Z-66ba36"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "orderedmap" % "1.0-dt-20200515Z-611dde",
  "org.scalablytyped" %%% "prosemirror-model" % "1.7-dt-20200515Z-367e01",
  "org.scalablytyped" %%% "prosemirror-transform" % "1.1-dt-20191101Z-b79e03",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
