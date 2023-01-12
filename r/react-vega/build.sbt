organization := "org.scalablytyped"
name := "react-vega"
version := "7.6.0-0f839c"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9b270c",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-6dfb17",
  "org.scalablytyped" %%% "fast-json-patch" % "3.1.1-790cc9",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-9c1d48",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-c1aa2f",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-fd69ea",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "vega" % "5.22.1-cba0a8",
  "org.scalablytyped" %%% "vega-embed" % "6.21.0-ab43ca",
  "org.scalablytyped" %%% "vega-expression" % "5.0.0-165f2c",
  "org.scalablytyped" %%% "vega-lite" % "5.6.0-8ba05f",
  "org.scalablytyped" %%% "vega-tooltip" % "0.28.0-66b2ab",
  "org.scalablytyped" %%% "vega-typings" % "0.22.3-f5bca6",
  "org.scalablytyped" %%% "vega-util" % "1.17.0-afec37")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
