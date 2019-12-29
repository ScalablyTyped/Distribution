organization := "org.scalablytyped"
name := "samchon-framework"
version := "2.1.4-68cd60"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ecol" % "1.1.0-d64233",
  "org.scalablytyped" %%% "samchon" % "2.1.4-d35170",
  "org.scalablytyped" %%% "std" % "3.7-953338",
  "org.scalablytyped" %%% "sxml" % "1.0.3-db51da",
  "org.scalablytyped" %%% "tstl" % "2.3.1-97c289",
  "org.scalablytyped" %%% "url-variables" % "1.0.2-47e63d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        