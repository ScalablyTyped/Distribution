organization := "org.scalablytyped"
name := "samchon"
version := "2.1.4-594676"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "ecol" % "1.0.4-742b01",
  "org.scalablytyped" %%% "std" % "3.5-c5d119",
  "org.scalablytyped" %%% "sxml" % "1.0.3-05f0c0",
  "org.scalablytyped" %%% "tstl" % "2.1.4-9cc1f3",
  "org.scalablytyped" %%% "url-variables" % "1.0.2-a3817a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        