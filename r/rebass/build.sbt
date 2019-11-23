organization := "org.scalablytyped"
name := "rebass"
version := "4.0-dt-20191016Z-d2e6b0"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-3eaa6f",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-8b44d5",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191122Z-caf4d8",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20191121Z-89fb36",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "styled-components" % "4.4-dt-20191109Z-a0e0fc",
  "org.scalablytyped" %%% "styled-system" % "5.1-dt-20191118Z-f63df4",
  "org.scalablytyped" %%% "styled-system__css" % "5.0-dt-20191115Z-ee682a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        