organization := "com.scalablytyped"
name := "react-native-elements"
version := "0.19.1-ce7480"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "csstype" % "2.5.7-d075d3",
  "com.scalablytyped" %%% "lodash" % "4.14-dt-20181105Z-aa3127",
  "com.scalablytyped" %%% "lodash_dot_isempty" % "4.4-dt-20180910Z-0688fa",
  "com.scalablytyped" %%% "lodash_dot_times" % "4.3-dt-20180910Z-99f777",
  "com.scalablytyped" %%% "prop-types" % "15.5-dt-20180927Z-c5aad4",
  "com.scalablytyped" %%% "react" % "16.7-dt-20181129Z-4e32c2",
  "com.scalablytyped" %%% "react-native" % "0.57-dt-20181128Z-49384d",
  "com.scalablytyped" %%% "react-native-vector-icons" % "4.6-dt-20181109Z-29fa9d",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        