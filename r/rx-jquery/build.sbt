organization := "org.scalablytyped"
name := "rx-jquery"
version := "0.0-unknown-dt-20190322Z-658184"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190108Z-6565a2",
  "org.scalablytyped" %%% "rx" % "4.1-dt-20190322Z-e3c67e",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20190322Z-2c0673",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20190322Z-2dfcc2",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20190322Z-b6b488",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20190322Z-e864c1",
  "org.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20181116Z-f34e7a",
  "org.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20180214Z-165fef",
  "org.scalablytyped" %%% "rx-lite-coincidence" % "4.0-dt-20190322Z-944171",
  "org.scalablytyped" %%% "rx-lite-experimental" % "4.0-dt-20180214Z-4c3928",
  "org.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20180214Z-942614",
  "org.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20180214Z-317747",
  "org.scalablytyped" %%% "rx-lite-time" % "4.0-dt-20190322Z-6f93a2",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20190322Z-8163ba",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-cab61f",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        