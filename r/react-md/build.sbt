organization := "org.scalablytyped"
name := "react-md"
version := "1.9.2-fbae41"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20180910Z-c23652",
  "org.scalablytyped" %%% "csstype" % "2.5.8-939493",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-df5d12",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181208Z-c640d3",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181203Z-df71a8",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181122Z-f8a261",
  "org.scalablytyped" %%% "react-motion" % "0.0-unknown-dt-20180910Z-55b920",
  "org.scalablytyped" %%% "react-swipeable-views" % "0.12-dt-20180910Z-b9e58b",
  "org.scalablytyped" %%% "react-transition-group" % "2.0-dt-20180910Z-f12e56",
  "org.scalablytyped" %%% "resize-observer-polyfill" % "1.5.1-f42599",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        