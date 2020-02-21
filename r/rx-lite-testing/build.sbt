organization := "org.scalablytyped"
name := "rx-lite-testing"
version := "4.0-dt-20180214Z-d952d1"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20190322Z-9ca714",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20190322Z-0e39ea",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20190322Z-4f3db9",
  "org.scalablytyped" %%% "std" % "3.7-1b8369")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
