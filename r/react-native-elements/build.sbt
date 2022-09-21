organization := "org.scalablytyped"
name := "react-native-elements"
version := "3.4.2-920230"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "color" % "3.0-dt-20220819Z-69bf8d",
  "org.scalablytyped" %%% "color-convert" % "2.0-dt-20211202Z-581571",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20211202Z-1cefc0",
  "org.scalablytyped" %%% "csstype" % "3.1.1-7b6cf2",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-737217",
  "org.scalablytyped" %%% "react" % "18.0-dt-20220913Z-bad9e4",
  "org.scalablytyped" %%% "react-native" % "0.70-dt-20220921Z-644601",
  "org.scalablytyped" %%% "react-native-ratings" % "8.1.0-06c3fd",
  "org.scalablytyped" %%% "react-native-vector-icons" % "6.4-dt-20220830Z-a0eb11",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-fce63f",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
