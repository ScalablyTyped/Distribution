organization := "org.scalablytyped"
name := "react-md__tree"
version := "5.1.4-ec4709"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9b270c",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-9c1d48",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-c1aa2f",
  "org.scalablytyped" %%% "react-md__icon" % "5.1.3-aa74ec",
  "org.scalablytyped" %%% "react-md__list" % "5.1.3-90c78a",
  "org.scalablytyped" %%% "react-md__portal" % "5.1.0-ac0e21",
  "org.scalablytyped" %%% "react-md__states" % "5.1.3-dea054",
  "org.scalablytyped" %%% "react-md__transition" % "5.1.3-b1cf60",
  "org.scalablytyped" %%% "react-md__utils" % "5.1.3-b85a75",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-fd69ea",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
