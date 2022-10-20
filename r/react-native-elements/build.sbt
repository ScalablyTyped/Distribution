organization := "org.scalablytyped"
name := "react-native-elements"
version := "3.4.2-c225ac"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "color" % "3.0-dt-20220819Z-aaf169",
  "org.scalablytyped" %%% "color-convert" % "2.0-dt-20211202Z-f12f7e",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20211202Z-1cefc0",
  "org.scalablytyped" %%% "csstype" % "3.1.1-775404",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-4c7983",
  "org.scalablytyped" %%% "react" % "18.0-dt-20220922Z-bacd1f",
  "org.scalablytyped" %%% "react-native" % "0.70-dt-20221018Z-7b7723",
  "org.scalablytyped" %%% "react-native-ratings" % "8.1.0-4e4f57",
  "org.scalablytyped" %%% "react-native-vector-icons" % "6.4-dt-20220830Z-e1a0c3",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-400bee",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
