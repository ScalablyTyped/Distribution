organization := "org.scalablytyped"
name := "samchon"
version := "2.1.4-0a0b10"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ecol" % "1.0.4-e76861",
  "org.scalablytyped" %%% "std" % "3.5-983486",
  "org.scalablytyped" %%% "sxml" % "1.0.3-808af4",
  "org.scalablytyped" %%% "tstl" % "2.2.1-cbe8ed",
  "org.scalablytyped" %%% "url-variables" % "1.0.2-bfa1ba")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        