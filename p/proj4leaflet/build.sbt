organization := "org.scalablytyped"
name := "proj4leaflet"
version := "1.0-dt-20181018Z-a151ba"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20180910Z-3f2d21",
  "org.scalablytyped" %%% "leaflet" % "1.2-dt-20181109Z-26559d",
  "org.scalablytyped" %%% "proj4" % "2.3-dt-20180910Z-7316a7",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        