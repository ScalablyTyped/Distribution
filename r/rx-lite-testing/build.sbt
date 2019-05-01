organization := "org.scalablytyped"
name := "rx-lite-testing"
version := "4.0-dt-20180214Z-88f5a0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20190322Z-b48c6a",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20190322Z-8e9c59",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20190322Z-fe6b06",
  "org.scalablytyped" %%% "std" % "3.4-495f93")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        