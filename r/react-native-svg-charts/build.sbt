organization := "org.scalablytyped"
name := "react-native-svg-charts"
version := "5.0-dt-20190619Z-e1b039"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-1967d7",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-5a8320",
  "org.scalablytyped" %%% "d3-scale" % "2.1-dt-20190212Z-cfb9fc",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20190212Z-a11350",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-4a9a8f",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-e54803",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191003Z-cca292",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20191004Z-c12942",
  "org.scalablytyped" %%% "react-native-svg" % "9.11.1-c105c7",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        