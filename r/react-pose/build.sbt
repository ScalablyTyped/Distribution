organization := "org.scalablytyped"
name := "react-pose"
version := "4.0.10-865657"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "2.6.14-344a29",
  "org.scalablytyped" %%% "popmotion-pose" % "3.4.11-6e4efb",
  "org.scalablytyped" %%% "popmotion__easing" % "1.0.2-0b2186",
  "org.scalablytyped" %%% "pose-core" % "2.1.1-446599",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-49dd4c",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-76d083",
  "org.scalablytyped" %%% "std" % "4.1-2f6855",
  "org.scalablytyped" %%% "style-value-types" % "3.1.9-bddf62",
  "org.scalablytyped" %%% "stylefire" % "7.0.3-8634a2",
  "org.scalablytyped" %%% "ts-essentials" % "2.0.12-dd96cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
