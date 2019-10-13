organization := "org.scalablytyped"
name := "react-pose"
version := "4.0.9-27d7d3"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-550e52",
  "org.scalablytyped" %%% "framesync" % "4.0.4-53733d",
  "org.scalablytyped" %%% "popmotion" % "8.7.0-153bf5",
  "org.scalablytyped" %%% "popmotion-pose" % "3.4.8-70a758",
  "org.scalablytyped" %%% "popmotion__easing" % "1.0.2-c509da",
  "org.scalablytyped" %%% "popmotion__popcorn" % "0.4.2-057531",
  "org.scalablytyped" %%% "pose-core" % "2.1.0-ef86e1",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-08cc8a",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191003Z-965e98",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "style-value-types" % "3.1.6-0dbe83",
  "org.scalablytyped" %%% "stylefire" % "4.1.4-721c38",
  "org.scalablytyped" %%% "ts-essentials" % "1.0.4-19088a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        