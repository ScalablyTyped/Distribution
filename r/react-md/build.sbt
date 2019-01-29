organization := "org.scalablytyped"
name := "react-md"
version := "1.9.2-4007e4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20181230Z-8c0e09",
  "org.scalablytyped" %%% "csstype" % "2.5.8-36deb1",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190128Z-23a585",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-e51e1e",
  "org.scalablytyped" %%% "react" % "16.7-dt-20190128Z-cfd22c",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181127Z-9427a2",
  "org.scalablytyped" %%% "react-motion" % "0.0-unknown-dt-20180806Z-6749ca",
  "org.scalablytyped" %%% "react-swipeable-views" % "0.12-dt-20180806Z-bab0b6",
  "org.scalablytyped" %%% "react-transition-group" % "2.0-dt-20181219Z-773aad",
  "org.scalablytyped" %%% "resize-observer-polyfill" % "1.5.1-3dfab5",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        