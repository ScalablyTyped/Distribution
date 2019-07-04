organization := "org.scalablytyped"
name := "react-pose"
version := "4.0.8-93a0dc"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.5-e47d18",
  "org.scalablytyped" %%% "framesync" % "4.0.2-26816d",
  "org.scalablytyped" %%% "popmotion" % "8.7.0-40920c",
  "org.scalablytyped" %%% "popmotion-pose" % "3.4.8-2b47c7",
  "org.scalablytyped" %%% "popmotion__easing" % "1.0.2-905b80",
  "org.scalablytyped" %%% "popmotion__popcorn" % "0.4.0-7060d0",
  "org.scalablytyped" %%% "pose-core" % "2.1.0-5f29c9",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-2a42a7",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190703Z-97e7d2",
  "org.scalablytyped" %%% "std" % "3.5-d4a303",
  "org.scalablytyped" %%% "style-value-types" % "3.1.4-808183",
  "org.scalablytyped" %%% "stylefire" % "4.1.4-cd5687")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        