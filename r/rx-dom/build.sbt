organization := "org.scalablytyped"
name := "rx-dom"
version := "7.0-dt-20180214Z-042a83"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "rx" % "4.1-dt-20180214Z-6fb779",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20180214Z-db6a12",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20180214Z-9e3b2f",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20181017Z-2029a5",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20180214Z-044016",
  "org.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20181116Z-00bcbf",
  "org.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20180214Z-e0d90b",
  "org.scalablytyped" %%% "rx-lite-coincidence" % "4.0-dt-20180214Z-d79cce",
  "org.scalablytyped" %%% "rx-lite-experimental" % "4.0-dt-20180214Z-9014f0",
  "org.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20180214Z-702dbc",
  "org.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20180214Z-e8fc7b",
  "org.scalablytyped" %%% "rx-lite-time" % "4.0-dt-20180214Z-f21f35",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20180214Z-c8341e",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        