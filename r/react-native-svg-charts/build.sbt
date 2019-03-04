organization := "org.scalablytyped"
name := "react-native-svg-charts"
version := "5.0-dt-20181105Z-e627a0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.2-49af40",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-0535a9",
  "org.scalablytyped" %%% "d3-scale" % "2.1-dt-20190212Z-d584e0",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20190212Z-4da604",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-eb41b5",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-0b0b5e",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190226Z-7328c8",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190221Z-a8323e",
  "org.scalablytyped" %%% "react-native-svg" % "9.2.4-97a278",
  "org.scalablytyped" %%% "std" % "3.3-05be79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        