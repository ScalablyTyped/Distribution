organization := "org.scalablytyped"
name := "samchon-framework"
version := "2.1.4-998f6f"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ecol" % "1.1.1-8e9dc1",
  "org.scalablytyped" %%% "samchon" % "2.1.4-acf28e",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "sxml" % "1.0.4-d7b5c9",
  "org.scalablytyped" %%% "tstl" % "2.4.1-dab0fa",
  "org.scalablytyped" %%% "url-variables" % "1.0.3-956e4b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
