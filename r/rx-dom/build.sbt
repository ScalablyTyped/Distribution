organization := "org.scalablytyped"
name := "rx-dom"
version := "7.0-dt-20180214Z-e1613c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "rx" % "4.1-dt-20190322Z-ddfbce",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20190322Z-936640",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20190322Z-5aed11",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20190322Z-e8b2c8",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20190322Z-31857f",
  "org.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20181116Z-7ac409",
  "org.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20180214Z-8d6c8b",
  "org.scalablytyped" %%% "rx-lite-coincidence" % "4.0-dt-20190322Z-897e72",
  "org.scalablytyped" %%% "rx-lite-experimental" % "4.0-dt-20180214Z-74bfe9",
  "org.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20180214Z-3b2dc4",
  "org.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20180214Z-6d3b22",
  "org.scalablytyped" %%% "rx-lite-time" % "4.0-dt-20190322Z-6b88de",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20190322Z-83b5cb",
  "org.scalablytyped" %%% "std" % "3.5-f010ac")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        