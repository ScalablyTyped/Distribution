organization := "org.scalablytyped"
name := "rebass"
version := "4.0-dt-20190822Z-d07a84"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-c240ab",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-f929bc",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190815Z-847c1a",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20190823Z-786e7e",
  "org.scalablytyped" %%% "std" % "3.5-cd493c",
  "org.scalablytyped" %%% "styled-components" % "4.1-dt-20190710Z-4e5064",
  "org.scalablytyped" %%% "styled-system" % "5.1-dt-20190823Z-44ad8b",
  "org.scalablytyped" %%% "styled-system__css" % "5.0-dt-20190812Z-fe4f01")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        