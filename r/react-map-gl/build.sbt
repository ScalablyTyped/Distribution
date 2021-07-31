organization := "org.scalablytyped"
name := "react-map-gl"
version := "5.2-dt-20201104Z-98cd30"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "2.6.14-b8d190",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20201002Z-fc1d16",
  "org.scalablytyped" %%% "gl-matrix" % "3.3.0-2e2650",
  "org.scalablytyped" %%% "mapbox-gl" % "1.12-dt-20201117Z-c66425",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-a12f9a",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-c80121",
  "org.scalablytyped" %%% "std" % "4.1-044efb",
  "org.scalablytyped" %%% "viewport-mercator-project" % "6.1-dt-20200809Z-a4cccc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
