organization := "org.scalablytyped"
name := "rx-lite-testing"
version := "4.0-dt-20180214Z-2aebfc"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20190322Z-e078c8",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20190322Z-7f6f22",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20190322Z-29f90b",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        