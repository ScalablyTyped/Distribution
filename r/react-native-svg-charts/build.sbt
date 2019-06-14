organization := "org.scalablytyped"
name := "react-native-svg-charts"
version := "5.0-dt-20181105Z-7abe6a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.5-3bfbc5",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-646c38",
  "org.scalablytyped" %%% "d3-scale" % "2.1-dt-20190212Z-deac52",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20190212Z-03d2f0",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-88a721",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-4b3bf2",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190613Z-62c565",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190613Z-729265",
  "org.scalablytyped" %%% "react-native-svg" % "9.5.1-cae152",
  "org.scalablytyped" %%% "std" % "3.5-c5d119")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        