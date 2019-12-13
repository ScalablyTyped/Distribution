organization := "org.scalablytyped"
name := "rebass"
version := "4.0-dt-20191016Z-379d77"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-a93afc",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-511330",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-5cddf8",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191209Z-f85fa6",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20191210Z-aec922",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "styled-components" % "4.4-dt-20191209Z-6c2e86",
  "org.scalablytyped" %%% "styled-system" % "5.1-dt-20191118Z-a4629b",
  "org.scalablytyped" %%% "styled-system__css" % "5.0-dt-20191115Z-9b9382")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        