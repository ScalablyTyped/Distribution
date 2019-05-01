organization := "org.scalablytyped"
name := "samchon-framework"
version := "2.1.4-618a95"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "ecol" % "1.0.4-b9b1a1",
  "org.scalablytyped" %%% "samchon" % "2.1.4-197953",
  "org.scalablytyped" %%% "std" % "3.4-495f93",
  "org.scalablytyped" %%% "sxml" % "1.0.3-d3e54e",
  "org.scalablytyped" %%% "tstl" % "2.1.2-fbc0d1",
  "org.scalablytyped" %%% "url-variables" % "1.0.2-d1a13a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        