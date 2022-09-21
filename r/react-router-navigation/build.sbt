organization := "org.scalablytyped"
name := "react-router-navigation"
version := "1.0-dt-20220407Z-1eec8c"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-7b6cf2",
  "org.scalablytyped" %%% "history" % "5.3.0-72cac1",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-737217",
  "org.scalablytyped" %%% "react" % "18.0-dt-20220913Z-bad9e4",
  "org.scalablytyped" %%% "react-native" % "0.70-dt-20220921Z-644601",
  "org.scalablytyped" %%% "react-router" % "6.4.0-0886de",
  "org.scalablytyped" %%% "react-router-navigation-core" % "1.0-dt-20220407Z-37d788",
  "org.scalablytyped" %%% "remix-run__router" % "1.0.0-e06ab5",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-fce63f",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
