organization := "org.scalablytyped"
name := "rx-angular"
version := "0.0-unknown-dt-20190322Z-e2444d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "angular" % "1.6-dt-20190206Z-3aa366",
  "org.scalablytyped" %%% "rx" % "4.1-dt-20190322Z-4fb6b4",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20190322Z-b04dfb",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20190322Z-4f6022",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20190322Z-af0be6",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20190322Z-9de2e2",
  "org.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20181116Z-6ecc87",
  "org.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20180214Z-da4e75",
  "org.scalablytyped" %%% "rx-lite-coincidence" % "4.0-dt-20190322Z-2e0ad1",
  "org.scalablytyped" %%% "rx-lite-experimental" % "4.0-dt-20180214Z-cfa6bc",
  "org.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20180214Z-2e4861",
  "org.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20180214Z-b4950d",
  "org.scalablytyped" %%% "rx-lite-time" % "4.0-dt-20190322Z-844df4",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20190322Z-c35828",
  "org.scalablytyped" %%% "std" % "3.3-14e863")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        