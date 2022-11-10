organization := "org.scalablytyped"
name := "serverless-jest-plugin"
version := "0.3-dt-20211202Z-991145"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aws-lambda" % "8.10-dt-20221018Z-22845c",
  "org.scalablytyped" %%% "lambda-wrapper" % "0.3-dt-20211202Z-b30510",
  "org.scalablytyped" %%% "serverless" % "3.12-dt-20220806Z-004302",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
