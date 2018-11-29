organization := "com.scalablytyped"
name := "semantic-ui-react"
version := "0.83.0-1a6e49"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "classnames" % "2.2-dt-20180910Z-d2b0a8",
  "com.scalablytyped" %%% "csstype" % "2.5.7-d075d3",
  "com.scalablytyped" %%% "exenv" % "1.2-dt-20180910Z-a80844",
  "com.scalablytyped" %%% "lodash" % "4.14-dt-20181105Z-aa3127",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181129Z-9f7a18",
  "com.scalablytyped" %%% "prop-types" % "15.5-dt-20180927Z-c5aad4",
  "com.scalablytyped" %%% "react" % "16.7-dt-20181129Z-4e32c2",
  "com.scalablytyped" %%% "react-dom" % "16.0-dt-20181122Z-40dc87",
  "com.scalablytyped" %%% "semantic-ui-react__event-stack" % "3.0.1-c601ee",
  "com.scalablytyped" %%% "shallowequal" % "v0.2.2-dt-20180910Z-532257",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        