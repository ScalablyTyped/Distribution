organization := "org.scalablytyped"
name := "react-native-goby"
version := "0.0.5-bc7468"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.5.8-a13970",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-ef1d9b",
  "org.scalablytyped" %%% "inquirer" % "0.0-unknown-dt-20180808Z-673ec9",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-753f08",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-77ce7e",
  "org.scalablytyped" %%% "plist" % "3.0-dt-20181029Z-b934d4",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-89199d",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181220Z-3dff88",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190103Z-0a62a3",
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
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20180214Z-f71070",
  "org.scalablytyped" %%% "xmlbuilder" % "0.0-unknown-dt-20180925Z-e9a3f0")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        