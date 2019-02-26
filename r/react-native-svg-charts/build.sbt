organization := "org.scalablytyped"
name := "react-native-svg-charts"
version := "5.0-dt-20181105Z-ac80e3"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.2-522be0",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-592800",
  "org.scalablytyped" %%% "d3-scale" % "2.1-dt-20190212Z-039122",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20190212Z-1017e2",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-7b4468",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20190212Z-8cdf18",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190225Z-abf012",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190221Z-f82265",
  "org.scalablytyped" %%% "react-native-svg" % "9.2.4-1fb517",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        