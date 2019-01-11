organization := "org.scalablytyped"
name := "react-md"
version := "1.9.2-ced3b9"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20181230Z-6d1ba2",
  "org.scalablytyped" %%% "csstype" % "2.5.8-61e37d",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2be335",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-692895",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181220Z-e34099",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181127Z-552d91",
  "org.scalablytyped" %%% "react-motion" % "0.0-unknown-dt-20180806Z-e58535",
  "org.scalablytyped" %%% "react-swipeable-views" % "0.12-dt-20180806Z-45f012",
  "org.scalablytyped" %%% "react-transition-group" % "2.0-dt-20181219Z-ea48f9",
  "org.scalablytyped" %%% "resize-observer-polyfill" % "1.5.1-f7416b",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        