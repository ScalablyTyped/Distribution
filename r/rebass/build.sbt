organization := "org.scalablytyped"
name := "rebass"
version := "4.0-dt-20200108Z-ab88d9"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-ffacbb",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-ee4622",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-05a52c",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200122Z-b17eee",
  "org.scalablytyped" %%% "react-native" % "0.61-dt-20200214Z-8d1cb4",
  "org.scalablytyped" %%% "std" % "3.7-1b8369",
  "org.scalablytyped" %%% "styled-components" % "4.4-dt-20200211Z-2e9cd7",
  "org.scalablytyped" %%% "styled-system" % "5.1-dt-20200130Z-b30257",
  "org.scalablytyped" %%% "styled-system__css" % "5.0-dt-20191115Z-1cc3fa")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
