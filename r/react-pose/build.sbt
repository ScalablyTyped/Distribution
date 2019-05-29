organization := "org.scalablytyped"
name := "react-pose"
version := "4.0.8-8ecb75"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.4-a0e5c1",
  "org.scalablytyped" %%% "framesync" % "4.0.2-26816d",
  "org.scalablytyped" %%% "popmotion" % "8.6.10-721b61",
  "org.scalablytyped" %%% "popmotion-pose" % "3.4.8-df77af",
  "org.scalablytyped" %%% "popmotion__easing" % "1.0.2-905b80",
  "org.scalablytyped" %%% "popmotion__popcorn" % "0.4.0-b58d68",
  "org.scalablytyped" %%% "pose-core" % "2.1.0-3b1be0",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-b94c72",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190528Z-1cea03",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb",
  "org.scalablytyped" %%% "style-value-types" % "3.1.4-a520df",
  "org.scalablytyped" %%% "stylefire" % "4.1.4-afb530")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        