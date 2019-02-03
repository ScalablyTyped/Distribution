organization := "org.scalablytyped"
name := "react-move"
version := "2.9.1-faa203"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.2-522be0",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20180520Z-a46f6d",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20180917Z-522108",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20180912Z-09fe77",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-8cdf18",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190201Z-f7085e",
  "org.scalablytyped" %%% "react-lifecycles-compat" % "3.0-dt-20190116Z-fdc198",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        