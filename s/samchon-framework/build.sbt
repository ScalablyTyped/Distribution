organization := "org.scalablytyped"
name := "samchon-framework"
version := "2.1.4-3aee27"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ecol" % "1.0.4-d8da2d",
  "org.scalablytyped" %%% "samchon" % "2.1.4-c74db9",
  "org.scalablytyped" %%% "std" % "3.5-cd493c",
  "org.scalablytyped" %%% "sxml" % "1.0.3-3a0166",
  "org.scalablytyped" %%% "tstl" % "2.2.3-37eb8d",
  "org.scalablytyped" %%% "url-variables" % "1.0.2-f1c10f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        