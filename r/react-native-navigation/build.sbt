organization := "org.scalablytyped"
name := "react-native-navigation"
version := "2.17.0-4ef333"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.3-61d3d0",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-7e744c",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190403Z-26e47b",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190418Z-4bd345",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        