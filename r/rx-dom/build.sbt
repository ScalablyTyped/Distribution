organization := "org.scalablytyped"
name := "rx-dom"
version := "7.0-dt-20200515Z-d41615"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20200515Z-cad6e8",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20200515Z-8dcb74",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20200515Z-a3fd19",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20200515Z-20eeae",
  "org.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20200515Z-dc6cc1",
  "org.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20200515Z-a673e7",
  "org.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20200515Z-636219",
  "org.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20200515Z-cd6b7b",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20200515Z-6998ee",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
