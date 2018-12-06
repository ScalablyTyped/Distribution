organization := "org.scalablytyped"
name := "react-ace"
version := "6.2.0-1adf34"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "brace" % "0.11.1-d8f244",
  "org.scalablytyped" %%% "csstype" % "2.5.8-bb2c56",
  "org.scalablytyped" %%% "diff-match-patch" % "1.0-dt-20180910Z-11a433",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-3dc8be",
  "org.scalablytyped" %%% "lodash_dot_get" % "4.4-dt-20180910Z-781514",
  "org.scalablytyped" %%% "lodash_dot_isequal" % "4.5-dt-20180910Z-ad0ca4",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-d9c01e",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20180927Z-dcbd7c",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181203Z-65cffa",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181122Z-221490",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        