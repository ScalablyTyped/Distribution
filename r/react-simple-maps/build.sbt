organization := "org.scalablytyped"
name := "react-simple-maps"
version := "3.0-dt-20221019Z-cde83a"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-f779a1",
  "org.scalablytyped" %%% "d3-color" % "3.1-dt-20220522Z-4a0944",
  "org.scalablytyped" %%% "d3-geo" % "3.0-dt-20211202Z-ff20a9",
  "org.scalablytyped" %%% "d3-interpolate" % "3.0-dt-20220624Z-d85eca",
  "org.scalablytyped" %%% "d3-selection" % "3.0-dt-20220720Z-e38452",
  "org.scalablytyped" %%% "d3-zoom" % "3.0-dt-20220624Z-3d878e",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20220713Z-93246d",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-fada11",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-fab591",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-08aa87",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
