organization := "org.scalablytyped"
name := "react-vega"
version := "7.6.0-b1b204"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-0912f8",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-e2199b",
  "org.scalablytyped" %%% "fast-json-patch" % "3.1.1-5cd847",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-975e63",
  "org.scalablytyped" %%% "react" % "18.0-dt-20220922Z-fc8273",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-3fbb8c",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "vega" % "5.22.1-1144d5",
  "org.scalablytyped" %%% "vega-embed" % "6.21.0-a62cad",
  "org.scalablytyped" %%% "vega-expression" % "5.0.0-4460c0",
  "org.scalablytyped" %%% "vega-lite" % "5.5.0-8179bf",
  "org.scalablytyped" %%% "vega-tooltip" % "0.28.0-dbe657",
  "org.scalablytyped" %%% "vega-typings" % "0.22.3-51cc51",
  "org.scalablytyped" %%% "vega-util" % "1.17.0-8e57c4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
