organization := "org.scalablytyped"
name := "serverless-jest-plugin"
version := "0.3-dt-20200219Z-66be60"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "aws-lambda" % "8.10-dt-20200415Z-2d703a",
  "org.scalablytyped" %%% "lambda-wrapper" % "0.3-dt-20200219Z-381198",
  "org.scalablytyped" %%% "serverless" % "1.67-dt-20200413Z-c666ea",
  "org.scalablytyped" %%% "std" % "3.8-9b2470")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
