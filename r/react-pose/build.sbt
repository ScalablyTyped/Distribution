organization := "org.scalablytyped"
name := "react-pose"
version := "4.0.8-7b045e"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-f01b27",
  "org.scalablytyped" %%% "framesync" % "4.0.4-bd50e7",
  "org.scalablytyped" %%% "popmotion" % "8.7.0-b9e769",
  "org.scalablytyped" %%% "popmotion-pose" % "3.4.8-2a0205",
  "org.scalablytyped" %%% "popmotion__easing" % "1.0.2-3f22d4",
  "org.scalablytyped" %%% "popmotion__popcorn" % "0.4.1-94a61b",
  "org.scalablytyped" %%% "pose-core" % "2.1.0-51ef7d",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-f929bc",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190815Z-93079a",
  "org.scalablytyped" %%% "std" % "3.5-cd493c",
  "org.scalablytyped" %%% "style-value-types" % "3.1.5-4369f4",
  "org.scalablytyped" %%% "stylefire" % "4.1.4-dfcc9e",
  "org.scalablytyped" %%% "ts-essentials" % "1.0.4-714ad8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        