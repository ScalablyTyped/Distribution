organization := "org.scalablytyped"
name := "samchon"
version := "2.1.4-726b88"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ecol" % "1.0.4-57c622",
  "org.scalablytyped" %%% "std" % "3.5-983486",
  "org.scalablytyped" %%% "sxml" % "1.0.3-b4ee12",
  "org.scalablytyped" %%% "tstl" % "2.2.0-ade195",
  "org.scalablytyped" %%% "url-variables" % "1.0.2-b80f3d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        