organization := "org.scalablytyped"
name := "rmc-calendar"
version := "1.1.4-c1e6a2"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20181230Z-9719bb",
  "org.scalablytyped" %%% "csstype" % "2.5.8-82546d",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-ff1a88",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181220Z-8bb0ba",
  "org.scalablytyped" %%% "rmc-date-picker" % "6.0.8-3619ff",
  "org.scalablytyped" %%% "rmc-dialog" % "1.1.1-c04b10",
  "org.scalablytyped" %%% "rmc-feedback" % "2.0.0-5a0c09",
  "org.scalablytyped" %%% "rmc-picker" % "5.0.5-41fe8d",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        