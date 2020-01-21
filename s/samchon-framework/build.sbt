organization := "org.scalablytyped"
name := "samchon-framework"
version := "2.1.4-758ca0"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ecol" % "1.1.0-cb5503",
  "org.scalablytyped" %%% "samchon" % "2.1.4-7d6053",
  "org.scalablytyped" %%% "std" % "3.7-96076c",
  "org.scalablytyped" %%% "sxml" % "1.0.3-4a3785",
  "org.scalablytyped" %%% "tstl" % "2.4.0-ff62e9",
  "org.scalablytyped" %%% "url-variables" % "1.0.2-7c354c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        