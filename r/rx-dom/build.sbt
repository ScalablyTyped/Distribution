organization := "org.scalablytyped"
name := "rx-dom"
version := "7.0-dt-20180214Z-558eea"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "rx" % "4.1-dt-20190322Z-3359fb",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20190322Z-42a185",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20190322Z-72523d",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20190322Z-ef54ce",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20190322Z-89af0b",
  "org.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20181116Z-d78e1d",
  "org.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20180214Z-99801b",
  "org.scalablytyped" %%% "rx-lite-coincidence" % "4.0-dt-20190322Z-3d3adf",
  "org.scalablytyped" %%% "rx-lite-experimental" % "4.0-dt-20180214Z-abaf4d",
  "org.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20180214Z-3b2dc4",
  "org.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20180214Z-6a3f06",
  "org.scalablytyped" %%% "rx-lite-time" % "4.0-dt-20190322Z-50f8a5",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20190322Z-116cb0",
  "org.scalablytyped" %%% "std" % "3.5-d4a303")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        