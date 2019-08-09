organization := "org.scalablytyped"
name := "react-pose"
version := "4.0.8-8b7f89"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-7e82e4",
  "org.scalablytyped" %%% "framesync" % "4.0.4-63d1d7",
  "org.scalablytyped" %%% "popmotion" % "8.7.0-d8def6",
  "org.scalablytyped" %%% "popmotion-pose" % "3.4.8-9db87d",
  "org.scalablytyped" %%% "popmotion__easing" % "1.0.2-de62fb",
  "org.scalablytyped" %%% "popmotion__popcorn" % "0.4.1-ecc50b",
  "org.scalablytyped" %%% "pose-core" % "2.1.0-565db7",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-f48590",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190809Z-2d489e",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc",
  "org.scalablytyped" %%% "style-value-types" % "3.1.5-5b7a48",
  "org.scalablytyped" %%% "stylefire" % "4.1.4-89dacc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        