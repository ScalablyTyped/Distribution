organization := "org.scalablytyped"
name := "proj4leaflet"
version := "1.0-dt-20221230Z-efeb24"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20220713Z-f1db3d",
  "org.scalablytyped" %%% "leaflet" % "1.9-dt-20230429Z-feed91",
  "org.scalablytyped" %%% "proj4" % "2.5-dt-20211202Z-12e50c",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
