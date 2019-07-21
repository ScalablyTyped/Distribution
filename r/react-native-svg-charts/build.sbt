organization := "org.scalablytyped"
name := "react-native-svg-charts"
version := "5.0-dt-20190619Z-80dc17"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-c945ed",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-e7ca07",
  "org.scalablytyped" %%% "d3-scale" % "2.1-dt-20190212Z-4fdea5",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20190212Z-340848",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-75922a",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-c6e514",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190703Z-55594c",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20190717Z-4b0893",
  "org.scalablytyped" %%% "react-native-svg" % "9.5.3-14e7d1",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        