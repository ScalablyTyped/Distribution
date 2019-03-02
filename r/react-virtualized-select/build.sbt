organization := "org.scalablytyped"
name := "react-virtualized-select"
version := "3.0-dt-20180802Z-33c983"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.2-481742",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-bb7734",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-66c044",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190226Z-9e9d73",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190213Z-4ff3b1",
  "org.scalablytyped" %%% "react-select" % "2.0-dt-20190215Z-32c24c",
  "org.scalablytyped" %%% "react-transition-group" % "2.0-dt-20190212Z-f660b8",
  "org.scalablytyped" %%% "react-virtualized" % "9.18-dt-20190110Z-0bb770",
  "org.scalablytyped" %%% "std" % "3.3-6e4388")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        