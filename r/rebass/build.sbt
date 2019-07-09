organization := "org.scalablytyped"
name := "rebass"
version := "3.0-dt-20190514Z-3eb134"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.5-523284",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-c6e514",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190703Z-5fe923",
  "org.scalablytyped" %%% "react-native" % "0.60-dt-20190705Z-39a76d",
  "org.scalablytyped" %%% "std" % "3.5-983486",
  "org.scalablytyped" %%% "styled-components" % "4.1-dt-20190604Z-0beb31",
  "org.scalablytyped" %%% "styled-system" % "5.0-dt-20190708Z-27166c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        