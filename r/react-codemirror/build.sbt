organization := "org.scalablytyped"
name := "react-codemirror"
version := "v1.0.0-dt-20180803Z-0a66ba"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "codemirror" % "0.0-unknown-dt-20181217Z-a1ee02",
  "org.scalablytyped" %%% "csstype" % "2.5.8-82546d",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20180417Z-6acda2",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-ff1a88",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181220Z-8bb0ba",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98",
  "org.scalablytyped" %%% "tern" % "0.22-dt-20181113Z-07a45d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        