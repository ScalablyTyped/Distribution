organization := "org.scalablytyped"
name := "react-pose"
version := "4.0.10-d432c4"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.9-2d2033",
  "org.scalablytyped" %%% "framesync" % "4.0.4-e92a0d",
  "org.scalablytyped" %%% "popmotion" % "8.7.1-748b09",
  "org.scalablytyped" %%% "popmotion-pose" % "3.4.11-86bf13",
  "org.scalablytyped" %%% "popmotion__easing" % "1.0.2-77add4",
  "org.scalablytyped" %%% "popmotion__popcorn" % "0.4.4-25b3a7",
  "org.scalablytyped" %%% "pose-core" % "2.1.1-6a47c2",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-ece683",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200122Z-fc5268",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "style-value-types" % "3.1.7-ba2c92",
  "org.scalablytyped" %%% "stylefire" % "7.0.2-87a891")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
