organization := "org.scalablytyped"
name := "react-leaflet"
version := "4.2.1-40b602"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.2-5927f3",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20220713Z-852eb7",
  "org.scalablytyped" %%% "leaflet" % "1.9-dt-20230429Z-f7aef8",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-4446ee",
  "org.scalablytyped" %%% "react" % "18.2-dt-20230506Z-14ab9d",
  "org.scalablytyped" %%% "react-leaflet__core" % "2.1.0-9fe0e0",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20230322Z-da1b40",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
