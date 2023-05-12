organization := "org.scalablytyped"
name := "react-vega"
version := "7.6.0-1234bb"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.2-5927f3",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20230419Z-f51b02",
  "org.scalablytyped" %%% "fast-json-patch" % "3.1.1-d970c8",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20220713Z-852eb7",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-4446ee",
  "org.scalablytyped" %%% "react" % "18.2-dt-20230506Z-14ab9d",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20230322Z-da1b40",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "vega" % "5.25.0-1fbc8a",
  "org.scalablytyped" %%% "vega-embed" % "6.22.1-865add",
  "org.scalablytyped" %%% "vega-expression" % "5.1.0-b706ac",
  "org.scalablytyped" %%% "vega-lite" % "5.9.0-101ae8",
  "org.scalablytyped" %%% "vega-tooltip" % "0.32.0-27f195",
  "org.scalablytyped" %%% "vega-typings" % "0.24.1-083a35",
  "org.scalablytyped" %%% "vega-util" % "1.17.2-d32680")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
