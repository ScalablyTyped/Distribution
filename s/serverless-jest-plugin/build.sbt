organization := "org.scalablytyped"
name := "serverless-jest-plugin"
version := "0.3-dt-20211202Z-0f9ca2"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aws-lambda" % "8.10-dt-20221018Z-ca4e3c",
  "org.scalablytyped" %%% "lambda-wrapper" % "0.3-dt-20211202Z-35c24c",
  "org.scalablytyped" %%% "serverless" % "3.12-dt-20220806Z-64fa7c",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
