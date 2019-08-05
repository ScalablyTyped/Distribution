organization := "org.scalablytyped"
name := "react-native-svg-charts"
version := "5.0-dt-20190619Z-56aea8"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-7e82e4",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-da723e",
  "org.scalablytyped" %%% "d3-scale" % "2.1-dt-20190212Z-2a85cd",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20190212Z-2a6244",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-749b1b",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-f48590",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190731Z-e8f22e",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20190802Z-48f8ad",
  "org.scalablytyped" %%% "react-native-svg" % "9.6.1-9fa84f",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        