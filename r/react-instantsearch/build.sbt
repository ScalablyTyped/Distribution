organization := "org.scalablytyped"
name := "react-instantsearch"
version := "5.2-dt-20181109Z-fc1253"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.5.8-bb2c56",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20180927Z-dcbd7c",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181203Z-65cffa",
  "org.scalablytyped" %%% "react-instantsearch-core" % "5.2-dt-20181206Z-2dcac8",
  "org.scalablytyped" %%% "react-instantsearch-dom" % "5.2-dt-20181206Z-310e1e",
  "org.scalablytyped" %%% "react-instantsearch-native" % "5.3-dt-20181104Z-26f045",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        