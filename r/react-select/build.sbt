organization := "org.scalablytyped"
name := "react-select"
version := "5.6.0-ac2bca"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-f779a1",
  "org.scalablytyped" %%% "emotion__react" % "11.10.5-eff810",
  "org.scalablytyped" %%% "emotion__serialize" % "1.1.1-91b0cb",
  "org.scalablytyped" %%% "emotion__utils" % "1.2.0-32a920",
  "org.scalablytyped" %%% "memoize-one" % "6.0.0-f76455",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-fada11",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-fab591",
  "org.scalablytyped" %%% "react-transition-group" % "4.4-dt-20220622Z-7749d3",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-08aa87",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
