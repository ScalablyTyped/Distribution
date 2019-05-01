organization := "org.scalablytyped"
name := "rx-dom"
version := "7.0-dt-20180214Z-ff7d85"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "rx" % "4.1-dt-20190322Z-716b6c",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20190322Z-b48c6a",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20190322Z-92537c",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20190322Z-8e9c59",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20190322Z-91f2f4",
  "org.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20181116Z-6b443f",
  "org.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20180214Z-3288de",
  "org.scalablytyped" %%% "rx-lite-coincidence" % "4.0-dt-20190322Z-ae0641",
  "org.scalablytyped" %%% "rx-lite-experimental" % "4.0-dt-20180214Z-6bcbe6",
  "org.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20180214Z-643086",
  "org.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20180214Z-88f5a0",
  "org.scalablytyped" %%% "rx-lite-time" % "4.0-dt-20190322Z-d63fe5",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20190322Z-fe6b06",
  "org.scalablytyped" %%% "std" % "3.4-495f93")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        