organization := "org.scalablytyped"
name := "react-sortable-tree-theme-file-explorer"
version := "0.0-dt-20181210Z-400d41"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "asap" % "2.0-dt-20180629Z-d36279",
  "org.scalablytyped" %%% "csstype" % "2.6.3-9dec0a",
  "org.scalablytyped" %%% "dnd-core" % "7.4.0-282b1a",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190304Z-f5f764",
  "org.scalablytyped" %%% "invariant" % "2.2.0-dt-20190322Z-96551b",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190311Z-7a74e5",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-1549d2",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190322Z-acd0bd",
  "org.scalablytyped" %%% "react-dnd" % "7.4.1-b4ade3",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190322Z-84fa90",
  "org.scalablytyped" %%% "react-sortable-tree" % "0.3-dt-20190318Z-25a227",
  "org.scalablytyped" %%% "react-virtualized" % "9.21-dt-20190315Z-1df86d",
  "org.scalablytyped" %%% "recompose" % "0.30-dt-20190322Z-0e9e7f",
  "org.scalablytyped" %%% "redux" % "4.0.1-436f26",
  "org.scalablytyped" %%% "shallowequal" % "1.1-dt-20190202Z-dc3836",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-1f290b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        