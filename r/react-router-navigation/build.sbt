organization := "org.scalablytyped"
name := "react-router-navigation"
version := "1.0-dt-20181017Z-294769"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.5.8-ae54dc",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20181017Z-846ff9",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-d610b9",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190201Z-1f77c5",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190130Z-d53ea9",
  "org.scalablytyped" %%% "react-navigation" % "3.0-dt-20181219Z-79275c",
  "org.scalablytyped" %%% "react-router" % "4.4-dt-20190103Z-f4cd70",
  "org.scalablytyped" %%% "react-router-navigation-core" % "1.0-dt-20181017Z-8cf090",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        