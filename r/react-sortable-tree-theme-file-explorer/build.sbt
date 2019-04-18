organization := "org.scalablytyped"
name := "react-sortable-tree-theme-file-explorer"
version := "0.0-dt-20181210Z-c33d1d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.3-61d3d0",
  "org.scalablytyped" %%% "dnd-core" % "7.4.4-e42278",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-803042",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-7e744c",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190403Z-26e47b",
  "org.scalablytyped" %%% "react-dnd" % "7.4.5-229c92",
  "org.scalablytyped" %%% "react-sortable-tree" % "0.3-dt-20190318Z-aecdbc",
  "org.scalablytyped" %%% "react-virtualized" % "9.21-dt-20190403Z-b7dd69",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        