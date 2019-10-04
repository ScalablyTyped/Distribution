organization := "org.scalablytyped"
name := "react-native-svg-charts"
version := "5.0-dt-20190619Z-58ecc2"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-f980df",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-5022af",
  "org.scalablytyped" %%% "d3-scale" % "2.1-dt-20190212Z-c2d94f",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20190212Z-ebc33e",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-f89bbe",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-06c3ac",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191003Z-b3917f",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20190930Z-0fb035",
  "org.scalablytyped" %%% "react-native-svg" % "9.11.1-5f49a7",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        