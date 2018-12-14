organization := "org.scalablytyped"
name := "react-native-svg-charts"
version := "5.0-dt-20181105Z-ac93dc"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "color" % "3.0-dt-20180910Z-66356f",
  "org.scalablytyped" %%% "color-convert" % "1.9-dt-20180910Z-e9e1c9",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180910Z-7f8b58",
  "org.scalablytyped" %%% "csstype" % "2.5.8-eb24f4",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20180910Z-c4d535",
  "org.scalablytyped" %%% "d3-scale" % "2.0-dt-20180927Z-f11924",
  "org.scalablytyped" %%% "d3-shape" % "1.2-dt-20181213Z-45ac4d",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20180918Z-0254d1",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-17fe49",
  "org.scalablytyped" %%% "pegjs" % "v0.10.0-dt-20180910Z-b1646a",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-32d5ea",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181213Z-7d04f8",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20181208Z-df16e2",
  "org.scalablytyped" %%% "react-native-svg" % "8.0.10-f8b3f8",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        