organization := "org.scalablytyped"
name := "react-pose"
version := "4.0.10-e3beba"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.9-03f85a",
  "org.scalablytyped" %%% "framesync" % "4.0.4-0c3df0",
  "org.scalablytyped" %%% "popmotion" % "8.7.3-3ad8c1",
  "org.scalablytyped" %%% "popmotion-pose" % "3.4.11-2cfcef",
  "org.scalablytyped" %%% "popmotion__easing" % "1.0.2-a8baa9",
  "org.scalablytyped" %%% "popmotion__popcorn" % "0.4.4-d45f5e",
  "org.scalablytyped" %%% "pose-core" % "2.1.1-2ae739",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-4fb81d",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200515Z-0f8114",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb",
  "org.scalablytyped" %%% "style-value-types" % "3.1.7-9908e4",
  "org.scalablytyped" %%% "stylefire" % "7.0.3-f800fc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
