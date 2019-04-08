organization := "org.scalablytyped"
name := "react-instantsearch"
version := "5.2-dt-20190215Z-ce36f7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "algoliasearch" % "3.30.1-dt-20190404Z-aa3cea",
  "org.scalablytyped" %%% "algoliasearch-helper" % "2.26-dt-20190212Z-3ad367",
  "org.scalablytyped" %%% "csstype" % "2.6.3-431253",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190330Z-7c1cfd",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f7ff2b",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190403Z-d8f967",
  "org.scalablytyped" %%% "react-instantsearch-core" % "5.2-dt-20190330Z-2673a1",
  "org.scalablytyped" %%% "react-instantsearch-dom" % "5.2-dt-20190215Z-eb37dc",
  "org.scalablytyped" %%% "react-instantsearch-native" % "5.3-dt-20190215Z-782423",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        