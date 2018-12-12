organization := "org.scalablytyped"
name := "proj4leaflet"
version := "1.0-dt-20181018Z-3ebbf8"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20180910Z-04a914",
  "org.scalablytyped" %%% "leaflet" % "1.2-dt-20181109Z-7b979c",
  "org.scalablytyped" %%% "proj4" % "2.3-dt-20180910Z-863e64",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        