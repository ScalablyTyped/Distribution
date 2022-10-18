organization := "org.scalablytyped"
name := "redux-devtools-log-monitor"
version := "2.1.0-9e4ccc"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "base16" % "1.0.0-dt-20220818Z-a415dc",
  "org.scalablytyped" %%% "csstype" % "3.1.1-775404",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-4c7983",
  "org.scalablytyped" %%% "react" % "18.0-dt-20220922Z-bacd1f",
  "org.scalablytyped" %%% "redux" % "4.2.0-b8cc4f",
  "org.scalablytyped" %%% "redux-devtools" % "3.7.0-95f634",
  "org.scalablytyped" %%% "redux-devtools-dock-monitor" % "1.2.0-e65475",
  "org.scalablytyped" %%% "redux-devtools-instrument" % "1.10.0-bf3eb0",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-400bee",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
