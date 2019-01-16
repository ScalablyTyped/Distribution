organization := "org.scalablytyped"
name := "rx-jquery"
version := "0.0-unknown-dt-20180214Z-2d44a0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190108Z-1d30f0",
  "org.scalablytyped" %%% "rx" % "4.1-dt-20180214Z-ab4c1e",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20180214Z-42cbcd",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20180214Z-390e4d",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20181017Z-30a111",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20180214Z-e6c363",
  "org.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20181116Z-f57cf9",
  "org.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20180214Z-f9f5e1",
  "org.scalablytyped" %%% "rx-lite-coincidence" % "4.0-dt-20180214Z-221d8f",
  "org.scalablytyped" %%% "rx-lite-experimental" % "4.0-dt-20180214Z-d00d43",
  "org.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20180214Z-d5b6cc",
  "org.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20180214Z-2ebb12",
  "org.scalablytyped" %%% "rx-lite-time" % "4.0-dt-20180214Z-8c9e58",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20180214Z-44e374",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-e7e832",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        