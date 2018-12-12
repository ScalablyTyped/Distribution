organization := "org.scalablytyped"
name := "react-native-svg-charts"
version := "5.0-dt-20181105Z-135f9d"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "color" % "3.0-dt-20180910Z-cf57a5",
  "org.scalablytyped" %%% "color-convert" % "1.9-dt-20180910Z-7baa92",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180910Z-f388aa",
  "org.scalablytyped" %%% "csstype" % "2.5.8-939493",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20180910Z-2d57fa",
  "org.scalablytyped" %%% "d3-scale" % "2.0-dt-20180927Z-9e5424",
  "org.scalablytyped" %%% "d3-shape" % "1.2-dt-20181116Z-c64ebc",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20180918Z-6f1ea1",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-93340d",
  "org.scalablytyped" %%% "pegjs" % "v0.10.0-dt-20180910Z-22eed8",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-7481e3",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181212Z-14da82",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20181208Z-ba08ae",
  "org.scalablytyped" %%% "react-native-svg" % "8.0.10-0a6402",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        