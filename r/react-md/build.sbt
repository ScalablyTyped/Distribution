organization := "org.scalablytyped"
name := "react-md"
version := "1.9.3-ef01aa"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20181230Z-2b6900",
  "org.scalablytyped" %%% "csstype" % "2.6.2-481742",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-bb7734",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-66c044",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190226Z-9e9d73",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190213Z-4ff3b1",
  "org.scalablytyped" %%% "react-motion" % "0.0-unknown-dt-20190212Z-35d85e",
  "org.scalablytyped" %%% "react-swipeable-views" % "0.13-dt-20190221Z-8d5b68",
  "org.scalablytyped" %%% "react-transition-group" % "2.0-dt-20190212Z-f660b8",
  "org.scalablytyped" %%% "resize-observer-polyfill" % "1.5.1-c52a23",
  "org.scalablytyped" %%% "std" % "3.3-6e4388")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        