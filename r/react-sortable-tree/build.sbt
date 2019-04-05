organization := "org.scalablytyped"
name := "react-sortable-tree"
version := "0.3-dt-20190318Z-002819"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "asap" % "2.0-dt-20180629Z-0f4a84",
  "org.scalablytyped" %%% "csstype" % "2.6.3-431253",
  "org.scalablytyped" %%% "dnd-core" % "7.4.4-5a6132",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-444aa6",
  "org.scalablytyped" %%% "invariant" % "2.2.0-dt-20190322Z-4a316b",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190330Z-7c1cfd",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f7ff2b",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190403Z-d8f967",
  "org.scalablytyped" %%% "react-dnd" % "7.4.5-9752f7",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190322Z-9aa93f",
  "org.scalablytyped" %%% "react-virtualized" % "9.21-dt-20190403Z-a0d8c7",
  "org.scalablytyped" %%% "redux" % "4.0.1-caedab",
  "org.scalablytyped" %%% "shallowequal" % "1.1-dt-20190202Z-0aa1a4",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-a7455c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        