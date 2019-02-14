organization := "org.scalablytyped"
name := "react-md"
version := "1.9.2-949223"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20181230Z-df7a56",
  "org.scalablytyped" %%% "csstype" % "2.6.2-522be0",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190212Z-0d969a",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20190212Z-8cdf18",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190212Z-8c7663",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190212Z-a2fc7c",
  "org.scalablytyped" %%% "react-motion" % "0.0-unknown-dt-20190212Z-c92578",
  "org.scalablytyped" %%% "react-swipeable-views" % "0.12-dt-20180806Z-9449c8",
  "org.scalablytyped" %%% "react-transition-group" % "2.0-dt-20190212Z-0136a6",
  "org.scalablytyped" %%% "resize-observer-polyfill" % "1.5.1-d5f303",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        