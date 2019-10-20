organization := "org.scalablytyped"
name := "rebass"
version := "4.0-dt-20191016Z-a9fef7"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-550e52",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-08cc8a",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191016Z-462cf8",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20191015Z-f406b4",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "styled-components" % "4.1-dt-20190909Z-310258",
  "org.scalablytyped" %%% "styled-system" % "5.1-dt-20190925Z-53631a",
  "org.scalablytyped" %%% "styled-system__css" % "5.0-dt-20190812Z-c73f4c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        