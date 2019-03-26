organization := "org.scalablytyped"
name := "react-spinners"
version := "0.5.3-6cf126"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.3-9dec0a",
  "org.scalablytyped" %%% "emotion__cache" % "10.0.9-ea461f",
  "org.scalablytyped" %%% "emotion__core" % "10.0.10-bd1d18",
  "org.scalablytyped" %%% "emotion__css" % "10.0.9-3572c2",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.6-94b869",
  "org.scalablytyped" %%% "emotion__sheet" % "0.9.2-3ea7b2",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.1-544bfc",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-1549d2",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190322Z-acd0bd",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190322Z-84fa90",
  "org.scalablytyped" %%% "recompose" % "0.30-dt-20190322Z-0e9e7f",
  "org.scalablytyped" %%% "std" % "3.3-14e863")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        