organization := "org.scalablytyped"
name := "samchon-framework"
version := "2.1.4-c313f1"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "ecol" % "1.0.4-ea2b98",
  "org.scalablytyped" %%% "samchon" % "2.1.4-801b80",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "sxml" % "1.0.3-dacea7",
  "org.scalablytyped" %%% "tstl" % "2.1.4-5d73fe",
  "org.scalablytyped" %%% "url-variables" % "1.0.2-15cf55")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        