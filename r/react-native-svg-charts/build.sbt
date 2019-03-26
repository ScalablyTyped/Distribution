organization := "org.scalablytyped"
name := "react-native-svg-charts"
version := "5.0-dt-20181105Z-97284b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.3-9dec0a",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-d6de91",
  "org.scalablytyped" %%% "d3-scale" % "2.1-dt-20190212Z-9a3781",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20190212Z-8f7f62",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-b054b2",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-1549d2",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190322Z-acd0bd",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190318Z-e91587",
  "org.scalablytyped" %%% "react-native-svg" % "9.3.6-205fcd",
  "org.scalablytyped" %%% "std" % "3.3-14e863")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        