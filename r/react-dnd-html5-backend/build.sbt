organization := "org.scalablytyped"
name := "react-dnd-html5-backend"
version := "7.0.2-cf8169"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "asap" % "2.0-dt-20180910Z-283adc",
  "org.scalablytyped" %%% "dnd-core" % "7.0.2-6a404e",
  "org.scalablytyped" %%% "invariant" % "2.2.0-dt-20180910Z-cbed6e",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-3dc8be",
  "org.scalablytyped" %%% "redux" % "4.0.1-5c98ab",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-46014e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        