organization := "org.scalablytyped"
name := "react-ace"
version := "6.3.2-6dc8d3"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "brace" % "0.11.1-48bb96",
  "org.scalablytyped" %%% "csstype" % "2.5.8-82546d",
  "org.scalablytyped" %%% "diff-match-patch" % "1.0-dt-20180214Z-34755b",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-010a28",
  "org.scalablytyped" %%% "lodash_dot_get" % "4.4-dt-20180723Z-0d24c4",
  "org.scalablytyped" %%% "lodash_dot_isequal" % "4.5-dt-20180723Z-b40066",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2aa425",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-ff1a88",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181220Z-8bb0ba",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181127Z-a4376a",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        