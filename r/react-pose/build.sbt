organization := "org.scalablytyped"
name := "react-pose"
version := "4.0.8-642394"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.4-b274af",
  "org.scalablytyped" %%% "framesync" % "4.0.2-c34341",
  "org.scalablytyped" %%% "popmotion" % "8.6.10-a29a1e",
  "org.scalablytyped" %%% "popmotion-pose" % "3.4.8-096469",
  "org.scalablytyped" %%% "popmotion__easing" % "1.0.2-dc84be",
  "org.scalablytyped" %%% "popmotion__popcorn" % "0.4.0-342abf",
  "org.scalablytyped" %%% "pose-core" % "2.1.0-d31605",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-ff94fb",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190520Z-336e99",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "style-value-types" % "3.1.4-3e9abe",
  "org.scalablytyped" %%% "stylefire" % "4.1.4-006af7")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        