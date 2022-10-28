organization := "org.scalablytyped"
name := "react-map-gl"
version := "6.1-dt-20220605Z-3b97e5"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9ea52b",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20220713Z-c7b900",
  "org.scalablytyped" %%% "gl-matrix" % "3.4.3-9a54c5",
  "org.scalablytyped" %%% "mapbox-gl" % "2.7-dt-20220928Z-8cccbd",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-115604",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221027Z-1a0a13",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-21791a",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "viewport-mercator-project" % "6.1-dt-20211202Z-b92feb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
