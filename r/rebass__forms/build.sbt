organization := "org.scalablytyped"
name := "rebass__forms"
version := "4.0-dt-20191227Z-423bdb"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-fd5644",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-516e80",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-b24434",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191220Z-22d23f",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20200106Z-21dc31",
  "org.scalablytyped" %%% "rebass" % "4.0-dt-20191016Z-119174",
  "org.scalablytyped" %%% "std" % "3.7-b6d959",
  "org.scalablytyped" %%% "styled-components" % "4.4-dt-20200107Z-cbc74c",
  "org.scalablytyped" %%% "styled-system" % "5.1-dt-20191118Z-d82299",
  "org.scalablytyped" %%% "styled-system__css" % "5.0-dt-20191115Z-bd05f6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        