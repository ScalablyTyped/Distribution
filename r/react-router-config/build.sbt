organization := "com.scalablytyped"
name := "react-router-config"
version := "1.1-dt-20181112Z-49a2f9"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "csstype" % "2.5.7-8f5757",
  "com.scalablytyped" %%% "history" % "4.7.2-dt-20181102Z-806809",
  "com.scalablytyped" %%% "prop-types" % "15.5-dt-20181102Z-3c49da",
  "com.scalablytyped" %%% "react" % "16.7-dt-20181116Z-28281f",
  "com.scalablytyped" %%% "react-router" % "4.4-dt-20181109Z-b5559b",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        