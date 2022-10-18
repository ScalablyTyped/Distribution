organization := "org.scalablytyped"
name := "serverless-jest-plugin"
version := "0.3-dt-20211202Z-80892a"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aws-lambda" % "8.10-dt-20221012Z-dfe092",
  "org.scalablytyped" %%% "lambda-wrapper" % "0.3-dt-20211202Z-3caf5d",
  "org.scalablytyped" %%% "serverless" % "3.12-dt-20220806Z-ff9d82",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
