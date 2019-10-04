organization := "org.scalablytyped"
name := "react-pose"
version := "4.0.8-1adc19"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-f980df",
  "org.scalablytyped" %%% "framesync" % "4.0.4-282561",
  "org.scalablytyped" %%% "popmotion" % "8.7.0-4ed804",
  "org.scalablytyped" %%% "popmotion-pose" % "3.4.8-5a00a6",
  "org.scalablytyped" %%% "popmotion__easing" % "1.0.2-ce16ed",
  "org.scalablytyped" %%% "popmotion__popcorn" % "0.4.2-5c25f9",
  "org.scalablytyped" %%% "pose-core" % "2.1.0-945404",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-06c3ac",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191003Z-b3917f",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "style-value-types" % "3.1.6-270307",
  "org.scalablytyped" %%% "stylefire" % "4.1.4-4be5b3",
  "org.scalablytyped" %%% "ts-essentials" % "1.0.4-26e58a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        