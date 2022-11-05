organization := "org.scalablytyped"
name := "react-simple-maps"
version := "3.0-dt-20221019Z-33abee"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9ea52b",
  "org.scalablytyped" %%% "d3-color" % "3.1-dt-20220522Z-9208ca",
  "org.scalablytyped" %%% "d3-geo" % "3.0-dt-20211202Z-36d0aa",
  "org.scalablytyped" %%% "d3-interpolate" % "3.0-dt-20220624Z-32d263",
  "org.scalablytyped" %%% "d3-selection" % "3.0-dt-20220720Z-606835",
  "org.scalablytyped" %%% "d3-zoom" % "3.0-dt-20220624Z-8ced9f",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20220713Z-c7b900",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-115604",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-e64588",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-21791a",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
