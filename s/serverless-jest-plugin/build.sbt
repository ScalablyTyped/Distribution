organization := "org.scalablytyped"
name := "serverless-jest-plugin"
version := "0.3-dt-20200219Z-73fe47"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "aws-lambda" % "8.10-dt-20200710Z-0d87db",
  "org.scalablytyped" %%% "lambda-wrapper" % "0.3-dt-20200219Z-77baef",
  "org.scalablytyped" %%% "serverless" % "1.72-dt-20200703Z-f31cb4",
  "org.scalablytyped" %%% "std" % "3.9-bafc13")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
