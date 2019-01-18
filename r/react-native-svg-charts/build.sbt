organization := "org.scalablytyped"
name := "react-native-svg-charts"
version := "5.0-dt-20181105Z-689e51"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "color" % "3.0-dt-20180214Z-c780a1",
  "org.scalablytyped" %%% "color-convert" % "1.9-dt-20180214Z-f2e3de",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180214Z-786ea5",
  "org.scalablytyped" %%% "csstype" % "2.5.8-36deb1",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20180514Z-cd4c8c",
  "org.scalablytyped" %%% "d3-scale" % "2.1-dt-20181216Z-c8c3e8",
  "org.scalablytyped" %%% "d3-shape" % "1.2-dt-20181208Z-3ed8ba",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20180912Z-9f621b",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-e51e1e",
  "org.scalablytyped" %%% "react" % "16.7-dt-20190116Z-73addc",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190115Z-56e436",
  "org.scalablytyped" %%% "react-native-svg" % "9.0.0-9ec06d",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        