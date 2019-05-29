organization := "org.scalablytyped"
name := "react-native-svg-charts"
version := "5.0-dt-20181105Z-7dd3a6"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.4-a0e5c1",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-646c38",
  "org.scalablytyped" %%% "d3-scale" % "2.1-dt-20190212Z-e83904",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20190212Z-19af2e",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-c9ddc4",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-b94c72",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190528Z-1cea03",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190524Z-5ebd32",
  "org.scalablytyped" %%% "react-native-svg" % "9.4.0-ea87db",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        