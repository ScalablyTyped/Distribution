organization := "org.scalablytyped"
name := "samchon-framework"
version := "2.1.4-dd5d60"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ecol" % "1.1.0-f17142",
  "org.scalablytyped" %%% "samchon" % "2.1.4-0286ea",
  "org.scalablytyped" %%% "std" % "3.7-b6d959",
  "org.scalablytyped" %%% "sxml" % "1.0.3-0ba569",
  "org.scalablytyped" %%% "tstl" % "2.3.1-356d06",
  "org.scalablytyped" %%% "url-variables" % "1.0.2-3ed78e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        