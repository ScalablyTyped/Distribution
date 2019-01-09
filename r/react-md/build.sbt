organization := "org.scalablytyped"
name := "react-md"
version := "1.9.2-82f36f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20181230Z-9719bb",
  "org.scalablytyped" %%% "csstype" % "2.5.8-82546d",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2aa425",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-ff1a88",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181220Z-8bb0ba",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181127Z-a4376a",
  "org.scalablytyped" %%% "react-motion" % "0.0-unknown-dt-20180806Z-af8313",
  "org.scalablytyped" %%% "react-swipeable-views" % "0.12-dt-20180806Z-d04f48",
  "org.scalablytyped" %%% "react-transition-group" % "2.0-dt-20181219Z-454686",
  "org.scalablytyped" %%% "resize-observer-polyfill" % "1.5.1-4811ae",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        