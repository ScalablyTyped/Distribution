organization := "org.scalablytyped"
name := "rebass"
version := "3.0-dt-20190514Z-ef1ff5"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.5-e47d18",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-2a42a7",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190621Z-9e424f",
  "org.scalablytyped" %%% "react-native" % "0.57-dt-20190625Z-f6c469",
  "org.scalablytyped" %%% "std" % "3.5-d4a303",
  "org.scalablytyped" %%% "styled-components" % "4.1-dt-20190604Z-5a7fa0",
  "org.scalablytyped" %%% "styled-system" % "4.2-dt-20190521Z-914908")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        