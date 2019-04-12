organization := "org.scalablytyped"
name := "react-json-view"
version := "1.19.1-4c7d48"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.3-431253",
  "org.scalablytyped" %%% "fbemitter" % "2.0.0-dt-20190322Z-75d5dc",
  "org.scalablytyped" %%% "flux" % "3.1-dt-20180803Z-19757d",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190409Z-512fe2",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f7ff2b",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190403Z-3351b3",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190411Z-db2943",
  "org.scalablytyped" %%% "react-lifecycles-compat" % "3.0-dt-20190116Z-923fe5",
  "org.scalablytyped" %%% "react-textarea-autosize" % "4.3.0-dt-20190404Z-9cdb66",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        