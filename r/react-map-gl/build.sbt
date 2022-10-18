organization := "org.scalablytyped"
name := "react-map-gl"
version := "6.1-dt-20220605Z-112db5"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-775404",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20220713Z-feb617",
  "org.scalablytyped" %%% "gl-matrix" % "3.4.3-071b13",
  "org.scalablytyped" %%% "mapbox-gl" % "2.7-dt-20220928Z-226c0d",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-4c7983",
  "org.scalablytyped" %%% "react" % "18.0-dt-20220922Z-bacd1f",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-400bee",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "viewport-mercator-project" % "6.1-dt-20211202Z-8cb3cb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
