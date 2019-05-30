organization := "org.scalablytyped"
name := "rx-lite-testing"
version := "4.0-dt-20180214Z-6d3b22"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20190322Z-936640",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20190322Z-e8b2c8",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20190322Z-83b5cb",
  "org.scalablytyped" %%% "std" % "3.5-f010ac")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        