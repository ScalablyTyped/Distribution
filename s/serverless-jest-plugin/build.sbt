organization := "org.scalablytyped"
name := "serverless-jest-plugin"
version := "0.3-dt-20200219Z-a0c21c"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "aws-lambda" % "8.10-dt-20200520Z-23bd8c",
  "org.scalablytyped" %%% "lambda-wrapper" % "0.3-dt-20200219Z-3e97a0",
  "org.scalablytyped" %%% "serverless" % "1.67-dt-20200519Z-a3ebbe",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
