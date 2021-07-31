organization := "org.scalablytyped"
name := "serverless-jest-plugin"
version := "0.3-dt-20200219Z-9affab"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aws-lambda" % "8.10-dt-20201013Z-509290",
  "org.scalablytyped" %%% "lambda-wrapper" % "0.3-dt-20200219Z-5d3746",
  "org.scalablytyped" %%% "serverless" % "1.78-dt-20201120Z-4b11bc",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
