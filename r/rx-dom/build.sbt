organization := "org.scalablytyped"
name := "rx-dom"
version := "7.0-dt-20180214Z-bcf5a8"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "rx" % "4.1-dt-20190322Z-50d338",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20190322Z-46a599",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20190322Z-af76f0",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20190322Z-164e8a",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20190322Z-5c855c",
  "org.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20181116Z-61f99e",
  "org.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20180214Z-39400c",
  "org.scalablytyped" %%% "rx-lite-coincidence" % "4.0-dt-20190322Z-ad8675",
  "org.scalablytyped" %%% "rx-lite-experimental" % "4.0-dt-20180214Z-ebdace",
  "org.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20180214Z-e36031",
  "org.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20180214Z-4ee09b",
  "org.scalablytyped" %%% "rx-lite-time" % "4.0-dt-20190322Z-5765ac",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20190322Z-bb3165",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        