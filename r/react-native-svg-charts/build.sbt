organization := "org.scalablytyped"
name := "react-native-svg-charts"
version := "5.0-dt-20191111Z-c98691"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-dcd929",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-816de5",
  "org.scalablytyped" %%% "d3-scale" % "2.1-dt-20190212Z-bfca76",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20191014Z-44c666",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-c2de6c",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-78233f",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191220Z-0e1ae9",
  "org.scalablytyped" %%% "react-native" % "0.61-dt-20200117Z-abf5f4",
  "org.scalablytyped" %%% "react-native-svg" % "9.13.6-f84c41",
  "org.scalablytyped" %%% "std" % "3.7-96076c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        