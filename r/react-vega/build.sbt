organization := "org.scalablytyped"
name := "react-vega"
version := "7.6.0-50646b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-ab3df7",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-9e7169",
  "org.scalablytyped" %%% "fast-json-patch" % "3.1.1-4efd39",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-53873f",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-9ff1b2",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-ea4558",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "vega" % "5.22.1-15c988",
  "org.scalablytyped" %%% "vega-embed" % "6.21.0-d41f7f",
  "org.scalablytyped" %%% "vega-expression" % "5.0.0-549f8b",
  "org.scalablytyped" %%% "vega-lite" % "5.6.0-fa3052",
  "org.scalablytyped" %%% "vega-tooltip" % "0.28.0-c4e9ef",
  "org.scalablytyped" %%% "vega-typings" % "0.22.3-218b2b",
  "org.scalablytyped" %%% "vega-util" % "1.17.0-723620")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
