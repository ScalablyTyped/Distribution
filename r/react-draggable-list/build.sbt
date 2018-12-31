organization := "org.scalablytyped"
name := "react-draggable-list"
version := "4.0.1-f1d169"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.5.8-a13970",
  "org.scalablytyped" %%% "immutability-helper" % "2.9.0-c1d584",
  "org.scalablytyped" %%% "invariant" % "2.2.0-dt-20180214Z-656266",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-89199d",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181220Z-3dff88",
  "org.scalablytyped" %%% "react-motion" % "0.0-unknown-dt-20180806Z-7b4f41",
  "org.scalablytyped" %%% "react-multi-ref" % "1.0.0-1fe4c4",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        