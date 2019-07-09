organization := "org.scalablytyped"
name := "react-pose"
version := "4.0.8-0d4909"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-c945ed",
  "org.scalablytyped" %%% "framesync" % "4.0.4-11603e",
  "org.scalablytyped" %%% "popmotion" % "8.7.0-dc8bdc",
  "org.scalablytyped" %%% "popmotion-pose" % "3.4.8-07be63",
  "org.scalablytyped" %%% "popmotion__easing" % "1.0.2-fc7ab9",
  "org.scalablytyped" %%% "popmotion__popcorn" % "0.4.1-2eb7f0",
  "org.scalablytyped" %%% "pose-core" % "2.1.0-db940c",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-c6e514",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190703Z-55594c",
  "org.scalablytyped" %%% "std" % "3.5-983486",
  "org.scalablytyped" %%% "style-value-types" % "3.1.5-a18fad",
  "org.scalablytyped" %%% "stylefire" % "4.1.4-cb5746")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        