organization := "org.scalablytyped"
name := "react-map-gl"
version := "6.1-dt-20220605Z-0f7482"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-f779a1",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20220713Z-93246d",
  "org.scalablytyped" %%% "gl-matrix" % "3.4.3-85a0f5",
  "org.scalablytyped" %%% "mapbox-gl" % "2.7-dt-20221102Z-cf0f80",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-fada11",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-fab591",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-08aa87",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "viewport-mercator-project" % "6.1-dt-20211202Z-8cd215")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
