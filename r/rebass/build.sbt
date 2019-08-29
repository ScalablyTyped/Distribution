organization := "org.scalablytyped"
name := "rebass"
version := "4.0-dt-20190822Z-62ed0b"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-f980df",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-fd4af0",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190815Z-6dcbc8",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20190823Z-4a5278",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "styled-components" % "4.1-dt-20190710Z-5b6403",
  "org.scalablytyped" %%% "styled-system" % "5.1-dt-20190823Z-d39e95",
  "org.scalablytyped" %%% "styled-system__css" % "5.0-dt-20190812Z-4a8fa3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        