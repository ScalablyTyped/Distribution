organization := "com.scalablytyped"
name := "react-intl-redux"
version := "v0.1.0-dt-20181102Z-88ecf5"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "csstype" % "2.5.7-8f5757",
  "com.scalablytyped" %%% "prop-types" % "15.5-dt-20181102Z-3c49da",
  "com.scalablytyped" %%% "react" % "16.7-dt-20181116Z-28281f",
  "com.scalablytyped" %%% "react-intl" % "2.3-dt-20181116Z-25df2d",
  "com.scalablytyped" %%% "react-redux" % "6.0.4-dt-20181102Z-30f5b8",
  "com.scalablytyped" %%% "redux" % "4.0.1-f538df",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "com.scalablytyped" %%% "symbol-observable" % "1.2.0-998bd5",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        