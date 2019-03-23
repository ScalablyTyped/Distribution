organization := "org.scalablytyped"
name := "react-sortable-tree-theme-file-explorer"
version := "0.0-dt-20181210Z-f818c6"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "asap" % "2.0-dt-20180629Z-ad04b4",
  "org.scalablytyped" %%% "csstype" % "2.6.3-29f798",
  "org.scalablytyped" %%% "dnd-core" % "7.2.0-0dc54d",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190304Z-bffeb5",
  "org.scalablytyped" %%% "invariant" % "2.2.0-dt-20190322Z-662401",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190311Z-601106",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190322Z-28a0c1",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f878d0",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190322Z-6f0f1a",
  "org.scalablytyped" %%% "react-dnd" % "7.3.2-a9d59c",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190322Z-7f8af2",
  "org.scalablytyped" %%% "react-sortable-tree" % "0.3-dt-20190318Z-7cd2da",
  "org.scalablytyped" %%% "react-virtualized" % "9.21-dt-20190315Z-25967f",
  "org.scalablytyped" %%% "recompose" % "0.30-dt-20190322Z-abb8b0",
  "org.scalablytyped" %%% "redux" % "4.0.1-18f3a8",
  "org.scalablytyped" %%% "shallowequal" % "1.1-dt-20190202Z-aebda3",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-5b665c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        