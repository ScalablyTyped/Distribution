organization := "org.scalablytyped"
name := "rx-lite-testing"
version := "4.0-dt-20180214Z-0b8c3a"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20190322Z-70806d",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20190322Z-1bb289",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20190322Z-f1e0ab",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        