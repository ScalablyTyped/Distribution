organization := "org.scalablytyped"
name := "react-sortable-tree"
version := "0.3-dt-20190318Z-ceb981"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.3-61d3d0",
  "org.scalablytyped" %%% "dnd-core" % "7.4.4-e42278",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-5c2025",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-7e744c",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190429Z-caf3c8",
  "org.scalablytyped" %%% "react-dnd" % "7.4.5-bc85ca",
  "org.scalablytyped" %%% "react-virtualized" % "9.21-dt-20190403Z-e1ddf6",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        