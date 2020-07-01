organization := "org.scalablytyped"
name := "react-pose"
version := "4.0.10-485bc1"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.9-7dae47",
  "org.scalablytyped" %%% "framesync" % "4.0.4-9390b7",
  "org.scalablytyped" %%% "popmotion" % "8.7.3-cb6c5c",
  "org.scalablytyped" %%% "popmotion-pose" % "3.4.11-25fcfd",
  "org.scalablytyped" %%% "popmotion__easing" % "1.0.2-a8baa9",
  "org.scalablytyped" %%% "popmotion__popcorn" % "0.4.4-9e267f",
  "org.scalablytyped" %%% "pose-core" % "2.1.1-7801f9",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-034048",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200624Z-23874e",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8",
  "org.scalablytyped" %%% "style-value-types" % "3.1.7-451e35",
  "org.scalablytyped" %%% "stylefire" % "7.0.3-6dfea3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
