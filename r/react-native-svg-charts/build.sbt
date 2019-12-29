organization := "org.scalablytyped"
name := "react-native-svg-charts"
version := "5.0-dt-20191111Z-b310cf"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-32adec",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-315940",
  "org.scalablytyped" %%% "d3-scale" % "2.1-dt-20190212Z-fcc331",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20191014Z-5a4578",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-87f0f2",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-bfe2c5",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191220Z-73a5bc",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20191223Z-967814",
  "org.scalablytyped" %%% "react-native-svg" % "9.13.6-9b2922",
  "org.scalablytyped" %%% "std" % "3.7-953338")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        