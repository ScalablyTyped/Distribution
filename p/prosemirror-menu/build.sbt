organization := "org.scalablytyped"
name := "prosemirror-menu"
version := "1.0-dt-20200527Z-dc9842"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "orderedmap" % "1.0-dt-20200515Z-cc558a",
  "org.scalablytyped" %%% "prosemirror-model" % "1.11-dt-20201109Z-0ade85",
  "org.scalablytyped" %%% "prosemirror-state" % "1.2-dt-20201002Z-d1f9b5",
  "org.scalablytyped" %%% "prosemirror-transform" % "1.1-dt-20191101Z-e16fd3",
  "org.scalablytyped" %%% "prosemirror-view" % "1.16-dt-20201015Z-8da7f0",
  "org.scalablytyped" %%% "std" % "4.1-c651d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
