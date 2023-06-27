organization := "org.scalablytyped"
name := "react-simple-maps"
version := "3.0-dt-20221019Z-b81755"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.2-466f86",
  "org.scalablytyped" %%% "d3-color" % "3.1-dt-20220522Z-9ae1d2",
  "org.scalablytyped" %%% "d3-geo" % "3.0-dt-20221230Z-245c31",
  "org.scalablytyped" %%% "d3-interpolate" % "3.0-dt-20221230Z-fb2f27",
  "org.scalablytyped" %%% "d3-selection" % "3.0-dt-20230317Z-7766af",
  "org.scalablytyped" %%% "d3-zoom" % "3.0-dt-20230525Z-fee2cf",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20220713Z-f1db3d",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-f202b2",
  "org.scalablytyped" %%% "react" % "18.2-dt-20230623Z-cbd5eb",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20230322Z-53038a",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
