organization := "org.scalablytyped"
name := "react-pose"
version := "4.0.10-2ed34d"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "csstype" % "2.6.14-b4f267",
  "org.scalablytyped" %%% "popmotion-pose" % "3.4.11-0b6bcb",
  "org.scalablytyped" %%% "popmotion__easing" % "1.0.2-58bb9f",
  "org.scalablytyped" %%% "pose-core" % "2.1.1-3c99c1",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-7dc507",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-9253ae",
  "org.scalablytyped" %%% "std" % "4.1-40053c",
  "org.scalablytyped" %%% "style-value-types" % "3.1.9-bb54a6",
  "org.scalablytyped" %%% "stylefire" % "7.0.3-4aee19",
  "org.scalablytyped" %%% "ts-essentials" % "2.0.12-e0e13a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
