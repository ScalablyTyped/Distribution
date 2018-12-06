organization := "org.scalablytyped"
name := "semantic-ui-react"
version := "0.83.0-0e3e85"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20180910Z-f5e9e0",
  "org.scalablytyped" %%% "csstype" % "2.5.8-bb2c56",
  "org.scalablytyped" %%% "exenv" % "1.2-dt-20180910Z-115f18",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-3dc8be",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-d9c01e",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20180927Z-dcbd7c",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181203Z-65cffa",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181122Z-221490",
  "org.scalablytyped" %%% "semantic-ui-react__event-stack" % "3.0.1-82bc54",
  "org.scalablytyped" %%% "shallowequal" % "v0.2.2-dt-20180910Z-337b8d",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        