organization := "org.scalablytyped"
name := "rx-lite-testing"
version := "4.0-dt-20200515Z-19893d"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20200515Z-0ed5b4",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20200515Z-734f14",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20200515Z-b4c72c",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
