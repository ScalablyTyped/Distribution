organization := "org.scalablytyped"
name := "react-pose"
version := "4.0.8-85c2ba"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.5-3bfbc5",
  "org.scalablytyped" %%% "framesync" % "4.0.2-26816d",
  "org.scalablytyped" %%% "popmotion" % "8.6.10-a38d5e",
  "org.scalablytyped" %%% "popmotion-pose" % "3.4.8-57700a",
  "org.scalablytyped" %%% "popmotion__easing" % "1.0.2-905b80",
  "org.scalablytyped" %%% "popmotion__popcorn" % "0.4.0-5f1bcf",
  "org.scalablytyped" %%% "pose-core" % "2.1.0-6569c7",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-4b3bf2",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190528Z-62c565",
  "org.scalablytyped" %%% "std" % "3.5-c5d119",
  "org.scalablytyped" %%% "style-value-types" % "3.1.4-1864e6",
  "org.scalablytyped" %%% "stylefire" % "4.1.4-26abd1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        