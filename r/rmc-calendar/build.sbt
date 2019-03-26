organization := "org.scalablytyped"
name := "rmc-calendar"
version := "1.1.4-50659e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20190325Z-43290b",
  "org.scalablytyped" %%% "csstype" % "2.6.3-9dec0a",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-1549d2",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190322Z-acd0bd",
  "org.scalablytyped" %%% "rmc-date-picker" % "6.0.8-34a594",
  "org.scalablytyped" %%% "rmc-dialog" % "1.1.1-75403a",
  "org.scalablytyped" %%% "rmc-feedback" % "2.0.0-c5e47e",
  "org.scalablytyped" %%% "rmc-picker" % "5.0.6-a0d860",
  "org.scalablytyped" %%% "std" % "3.3-14e863")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        