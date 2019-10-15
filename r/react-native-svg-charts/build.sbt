organization := "org.scalablytyped"
name := "react-native-svg-charts"
version := "5.0-dt-20190619Z-666ad2"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-550e52",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-5a8320",
  "org.scalablytyped" %%% "d3-scale" % "2.1-dt-20190212Z-c9c1d8",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20191014Z-184aed",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-00ad12",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-08cc8a",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191014Z-d5b0ca",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20191007Z-cc9d0b",
  "org.scalablytyped" %%% "react-native-svg" % "9.11.1-63565e",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        