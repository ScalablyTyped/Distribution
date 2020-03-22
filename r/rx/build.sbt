organization := "org.scalablytyped"
name := "rx"
version := "4.1-dt-20190322Z-8752dd"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20190322Z-0759c8",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20190322Z-9110c0",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20190322Z-1f3e32",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20190322Z-32f9a9",
  "org.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20181116Z-6eb595",
  "org.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20180214Z-6b1c48",
  "org.scalablytyped" %%% "rx-lite-coincidence" % "4.0-dt-20190322Z-dab2d6",
  "org.scalablytyped" %%% "rx-lite-experimental" % "4.0-dt-20180214Z-c8ad8e",
  "org.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20180214Z-cc532d",
  "org.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20180214Z-c75d6b",
  "org.scalablytyped" %%% "rx-lite-time" % "4.0-dt-20190322Z-f8fa94",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20190322Z-6899d3",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
