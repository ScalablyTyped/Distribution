organization := "org.scalablytyped"
name := "react-pose"
version := "4.0.8-7f0154"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.5-523284",
  "org.scalablytyped" %%% "framesync" % "4.0.2-11603e",
  "org.scalablytyped" %%% "popmotion" % "8.7.0-a11b9c",
  "org.scalablytyped" %%% "popmotion-pose" % "3.4.8-99bb73",
  "org.scalablytyped" %%% "popmotion__easing" % "1.0.2-fc7ab9",
  "org.scalablytyped" %%% "popmotion__popcorn" % "0.4.0-5f7bfa",
  "org.scalablytyped" %%% "pose-core" % "2.1.0-db940c",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-c6e514",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190703Z-5fe923",
  "org.scalablytyped" %%% "std" % "3.5-983486",
  "org.scalablytyped" %%% "style-value-types" % "3.1.4-a18fad",
  "org.scalablytyped" %%% "stylefire" % "4.1.4-cb5746")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        