organization := "org.scalablytyped"
name := "react-toolbox"
version := "2.0.0-beta.13-b2e197"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20190326Z-9fc905",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180921Z-0940d0",
  "org.scalablytyped" %%% "csstype" % "2.6.3-431253",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-444aa6",
  "org.scalablytyped" %%% "invariant" % "2.2.0-dt-20190322Z-4a316b",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190330Z-7c1cfd",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f7ff2b",
  "org.scalablytyped" %%% "ramda" % "0.26-dt-20190330Z-26caa6",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190403Z-d8f967",
  "org.scalablytyped" %%% "react-css-themr" % "2.1.2-7819bd",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190322Z-9aa93f",
  "org.scalablytyped" %%% "react-transition-group" % "2.8-dt-20190404Z-861001",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        