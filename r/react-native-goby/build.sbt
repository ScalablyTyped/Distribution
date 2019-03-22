organization := "org.scalablytyped"
name := "react-native-goby"
version := "0.0.5-2d2b11"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.3-29f798",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-2e51d2",
  "org.scalablytyped" %%% "inquirer" % "0.0-unknown-dt-20190221Z-211f2a",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-0a2b2c",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190320Z-26b6b7",
  "org.scalablytyped" %%% "plist" % "3.0-dt-20181029Z-2262ad",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f878d0",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190314Z-6f0f1a",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190318Z-7533ec",
  "org.scalablytyped" %%% "rx" % "4.1-dt-20180214Z-afef54",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20180214Z-d2f95e",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20180214Z-2a1bd5",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20181017Z-ecbab5",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20180214Z-794432",
  "org.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20181116Z-e79331",
  "org.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20180214Z-44ae75",
  "org.scalablytyped" %%% "rx-lite-coincidence" % "4.0-dt-20180214Z-32f9e9",
  "org.scalablytyped" %%% "rx-lite-experimental" % "4.0-dt-20180214Z-74c9e9",
  "org.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20180214Z-5dae72",
  "org.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20180214Z-ef0eac",
  "org.scalablytyped" %%% "rx-lite-time" % "4.0-dt-20180214Z-bd0f41",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20180214Z-0ec9a6",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20180214Z-e56f09",
  "org.scalablytyped" %%% "xmlbuilder" % "0.0-unknown-dt-20180925Z-7896d1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        