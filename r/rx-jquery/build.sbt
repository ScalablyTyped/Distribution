organization := "org.scalablytyped"
name := "rx-jquery"
version := "0.0-unknown-dt-20190322Z-8b7686"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190108Z-dfa39a",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20190322Z-6ef090",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20190322Z-267042",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20190322Z-b81cfa",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20190322Z-dc835c",
  "org.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20181116Z-8f1134",
  "org.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20180214Z-c5853c",
  "org.scalablytyped" %%% "rx-lite-coincidence" % "4.0-dt-20190322Z-8abbae",
  "org.scalablytyped" %%% "rx-lite-experimental" % "4.0-dt-20180214Z-aa2270",
  "org.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20180214Z-3b2dc4",
  "org.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20180214Z-29cfbe",
  "org.scalablytyped" %%% "rx-lite-time" % "4.0-dt-20190322Z-517a1c",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20190322Z-d18193",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-fd7d83",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        