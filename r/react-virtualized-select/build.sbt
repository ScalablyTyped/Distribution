organization := "com.scalablytyped"
name := "react-virtualized-select"
version := "3.0-dt-20180910Z-a23095"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "csstype" % "2.5.7-eccde3",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181121Z-5a910f",
  "com.scalablytyped" %%% "prop-types" % "15.5-dt-20180927Z-7b533e",
  "com.scalablytyped" %%% "react" % "16.7-dt-20181122Z-2ddd12",
  "com.scalablytyped" %%% "react-dom" % "16.0-dt-20181122Z-3e11f7",
  "com.scalablytyped" %%% "react-select" % "2.0-dt-20181013Z-549b83",
  "com.scalablytyped" %%% "react-transition-group" % "2.0-dt-20180910Z-b9d453",
  "com.scalablytyped" %%% "react-virtualized" % "9.18-dt-20181116Z-e2e0c1",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        