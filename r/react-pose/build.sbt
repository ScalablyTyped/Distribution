organization := "org.scalablytyped"
name := "react-pose"
version := "4.0.10-449dd6"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "2.6.14-b8d190",
  "org.scalablytyped" %%% "popmotion-pose" % "3.4.11-a18d07",
  "org.scalablytyped" %%% "popmotion__easing" % "1.0.2-6076c4",
  "org.scalablytyped" %%% "pose-core" % "2.1.1-7ad6b8",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-a12f9a",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-c80121",
  "org.scalablytyped" %%% "std" % "4.1-044efb",
  "org.scalablytyped" %%% "style-value-types" % "3.1.9-bd24ea",
  "org.scalablytyped" %%% "stylefire" % "7.0.3-87a7a6",
  "org.scalablytyped" %%% "ts-essentials" % "2.0.12-291e2a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
