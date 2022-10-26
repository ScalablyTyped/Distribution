organization := "org.scalablytyped"
name := "react-vega"
version := "7.6.0-93e647"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9ea52b",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-6f817a",
  "org.scalablytyped" %%% "fast-json-patch" % "3.1.1-45d3d7",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-115604",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221025Z-ca420a",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-21791a",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "vega" % "5.22.1-ee4158",
  "org.scalablytyped" %%% "vega-embed" % "6.21.0-5b2868",
  "org.scalablytyped" %%% "vega-expression" % "5.0.0-934111",
  "org.scalablytyped" %%% "vega-lite" % "5.6.0-5bbe91",
  "org.scalablytyped" %%% "vega-tooltip" % "0.28.0-d1448f",
  "org.scalablytyped" %%% "vega-typings" % "0.22.3-a52279",
  "org.scalablytyped" %%% "vega-util" % "1.17.0-d98f5b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
