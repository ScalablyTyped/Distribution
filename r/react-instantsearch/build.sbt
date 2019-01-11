organization := "org.scalablytyped"
name := "react-instantsearch"
version := "5.2-dt-20181206Z-5e7422"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.5.8-61e37d",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-692895",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181220Z-e34099",
  "org.scalablytyped" %%% "react-instantsearch-core" % "5.2-dt-20181206Z-4197b5",
  "org.scalablytyped" %%% "react-instantsearch-dom" % "5.2-dt-20181205Z-29c603",
  "org.scalablytyped" %%% "react-instantsearch-native" % "5.3-dt-20181024Z-b68b68",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        