organization := "org.scalablytyped"
name := "rx-lite-testing"
version := "4.0-dt-20180214Z-0a8b6a"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20190322Z-94909f",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20190322Z-3e8b9d",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20190322Z-bad4b1",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        