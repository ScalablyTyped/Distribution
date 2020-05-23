organization := "org.scalablytyped"
name := "prosemirror-schema-list"
version := "1.0-dt-20200515Z-d14088"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "orderedmap" % "1.0-dt-20200515Z-611dde",
  "org.scalablytyped" %%% "prosemirror-model" % "1.7-dt-20200515Z-b8bc32",
  "org.scalablytyped" %%% "prosemirror-state" % "1.2-dt-20200515Z-75728a",
  "org.scalablytyped" %%% "prosemirror-transform" % "1.1-dt-20191101Z-104960",
  "org.scalablytyped" %%% "prosemirror-view" % "1.11-dt-20200515Z-c3c71e",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
