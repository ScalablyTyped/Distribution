organization := "org.scalablytyped"
name := "react-native-svg-charts"
version := "5.0-dt-20181105Z-6c9bdb"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.2-481742",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-425ef0",
  "org.scalablytyped" %%% "d3-scale" % "2.1-dt-20190212Z-d2ab66",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20190212Z-9c770a",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-87ce9c",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-66c044",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190226Z-9e9d73",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190221Z-280c3d",
  "org.scalablytyped" %%% "react-native-svg" % "9.2.4-e74faf",
  "org.scalablytyped" %%% "std" % "3.3-6e4388")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        