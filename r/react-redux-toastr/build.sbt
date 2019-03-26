organization := "org.scalablytyped"
name := "react-redux-toastr"
version := "7.4-dt-20190322Z-3c7733"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.3-9dec0a",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-1549d2",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190322Z-acd0bd",
  "org.scalablytyped" %%% "redux" % "4.0.1-436f26",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-1f290b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        