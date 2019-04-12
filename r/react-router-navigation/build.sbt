organization := "org.scalablytyped"
name := "react-router-navigation"
version := "1.0-dt-20190212Z-9a2e73"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.3-431253",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20190322Z-992596",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f7ff2b",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190403Z-3351b3",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190410Z-5e5772",
  "org.scalablytyped" %%% "react-navigation" % "3.0-dt-20190328Z-7cc5e8",
  "org.scalablytyped" %%% "react-router" % "4.4-dt-20190228Z-a0816d",
  "org.scalablytyped" %%% "react-router-navigation-core" % "1.0-dt-20181017Z-a5a07f",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        