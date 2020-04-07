organization := "org.scalablytyped"
name := "samchon"
version := "2.1.4-242b45"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ecol" % "1.1.1-4aab1e",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "sxml" % "1.0.4-069aa6",
  "org.scalablytyped" %%% "tstl" % "2.4.2-3f91a8",
  "org.scalablytyped" %%% "url-variables" % "1.0.3-1d0e16")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
