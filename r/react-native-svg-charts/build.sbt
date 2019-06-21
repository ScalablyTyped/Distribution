organization := "org.scalablytyped"
name := "react-native-svg-charts"
version := "5.0-dt-20190619Z-9f0c0f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.5-e47d18",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-646c38",
  "org.scalablytyped" %%% "d3-scale" % "2.1-dt-20190212Z-35d8fc",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20190212Z-058182",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-3080d7",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-2a42a7",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190621Z-8d8143",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190613Z-c4532e",
  "org.scalablytyped" %%% "react-native-svg" % "9.5.1-bd13cf",
  "org.scalablytyped" %%% "std" % "3.5-d4a303")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        