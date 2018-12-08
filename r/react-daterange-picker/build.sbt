organization := "org.scalablytyped"
name := "react-daterange-picker"
version := "2.0-dt-20181002Z-219fd2"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.5.8-bb2c56",
  "org.scalablytyped" %%% "moment" % "2.22.2-39aab6",
  "org.scalablytyped" %%% "moment-range" % "3.1-dt-20180910Z-beaa56",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181208Z-000ab2",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181203Z-1b8e7c",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        