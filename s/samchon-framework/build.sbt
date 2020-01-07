organization := "org.scalablytyped"
name := "samchon-framework"
version := "2.1.4-3aa34c"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ecol" % "1.1.0-2f441f",
  "org.scalablytyped" %%% "samchon" % "2.1.4-d2e67b",
  "org.scalablytyped" %%% "std" % "3.7-b6d959",
  "org.scalablytyped" %%% "sxml" % "1.0.3-935372",
  "org.scalablytyped" %%% "tstl" % "2.4.0-2709b1",
  "org.scalablytyped" %%% "url-variables" % "1.0.2-682c33")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        