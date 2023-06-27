organization := "org.scalablytyped"
name := "serverless-jest-plugin"
version := "0.3-dt-20211202Z-800ee0"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aws-lambda" % "8.10-dt-20230614Z-170ca0",
  "org.scalablytyped" %%% "lambda-wrapper" % "0.3-dt-20211202Z-91c22a",
  "org.scalablytyped" %%% "serverless" % "3.12-dt-20230624Z-306f69",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
