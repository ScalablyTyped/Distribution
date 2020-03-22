organization := "org.scalablytyped"
name := "rx-lite-testing"
version := "4.0-dt-20200225Z-13c555"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20200225Z-0759c8",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20200225Z-6ec3ef",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20200225Z-9814df",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
