organization := "org.scalablytyped"
name := "serverless-jest-plugin"
version := "0.3-dt-20211202Z-c32ce1"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aws-lambda" % "8.10-dt-20220913Z-5575d8",
  "org.scalablytyped" %%% "lambda-wrapper" % "0.3-dt-20211202Z-33f670",
  "org.scalablytyped" %%% "serverless" % "3.12-dt-20220806Z-1b83c8",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
