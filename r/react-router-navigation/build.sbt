organization := "com.scalablytyped"
name := "react-router-navigation"
version := "1.0-dt-20181018Z-8f87cf"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "csstype" % "2.5.7-eccde3",
  "com.scalablytyped" %%% "history" % "4.7.2-dt-20181018Z-c0d74d",
  "com.scalablytyped" %%% "prop-types" % "15.5-dt-20180927Z-7b533e",
  "com.scalablytyped" %%% "react" % "16.7-dt-20181122Z-2ddd12",
  "com.scalablytyped" %%% "react-native" % "0.57-dt-20181121Z-29a22e",
  "com.scalablytyped" %%% "react-navigation" % "2.13-dt-20181126Z-511c97",
  "com.scalablytyped" %%% "react-router" % "4.4-dt-20181109Z-1ad10b",
  "com.scalablytyped" %%% "react-router-navigation-core" % "1.0-dt-20181018Z-f4f367",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        