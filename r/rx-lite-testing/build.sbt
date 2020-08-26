organization := "org.scalablytyped"
name := "rx-lite-testing"
version := "4.0-dt-20200515Z-f29457"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20200515Z-1a8c2a",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20200515Z-4683a9",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20200515Z-56444a",
  "org.scalablytyped" %%% "std" % "3.9-bafc13")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
