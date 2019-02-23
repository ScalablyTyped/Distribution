organization := "org.scalablytyped"
name := "react-virtualized-select"
version := "3.0-dt-20180802Z-319430"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.2-522be0",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190215Z-604ea6",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20190212Z-8cdf18",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190220Z-16f783",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190213Z-4334cf",
  "org.scalablytyped" %%% "react-select" % "2.0-dt-20190215Z-5d900b",
  "org.scalablytyped" %%% "react-transition-group" % "2.0-dt-20190212Z-fd7bac",
  "org.scalablytyped" %%% "react-virtualized" % "9.18-dt-20190110Z-d61562",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        