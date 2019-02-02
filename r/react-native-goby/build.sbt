organization := "org.scalablytyped"
name := "react-native-goby"
version := "0.0.5-d39607"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.5.8-ae54dc",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-64d14d",
  "org.scalablytyped" %%% "inquirer" % "0.0-unknown-dt-20180808Z-ab0492",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-785a8e",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-8da1df",
  "org.scalablytyped" %%% "plist" % "3.0-dt-20181029Z-ba2dd2",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-d610b9",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190201Z-1f77c5",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190130Z-d53ea9",
  "org.scalablytyped" %%% "rx" % "4.1-dt-20180214Z-e5844c",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20180214Z-5e603c",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20180214Z-6f9804",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20181017Z-65ad54",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20180214Z-528df6",
  "org.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20181116Z-4bdd36",
  "org.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20180214Z-1e9fd9",
  "org.scalablytyped" %%% "rx-lite-coincidence" % "4.0-dt-20180214Z-c09f2d",
  "org.scalablytyped" %%% "rx-lite-experimental" % "4.0-dt-20180214Z-9ffc9b",
  "org.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20180214Z-6ee1a7",
  "org.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20180214Z-9ed148",
  "org.scalablytyped" %%% "rx-lite-time" % "4.0-dt-20180214Z-dc72ce",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20180214Z-28a9e6",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20180214Z-71b24c",
  "org.scalablytyped" %%% "xmlbuilder" % "0.0-unknown-dt-20180925Z-a98a90")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        