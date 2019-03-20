organization := "org.scalablytyped"
name := "react-native-svg-charts"
version := "5.0-dt-20181105Z-be1ebb"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.3-29f798",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-4f9a84",
  "org.scalablytyped" %%% "d3-scale" % "2.1-dt-20190212Z-0106fa",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20190212Z-cd5971",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-130d19",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f878d0",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190314Z-6f0f1a",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190318Z-7533ec",
  "org.scalablytyped" %%% "react-native-svg" % "9.3.5-f7bedd",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        