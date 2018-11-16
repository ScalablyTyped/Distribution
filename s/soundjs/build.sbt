organization := "com.scalablytyped"
name := "soundjs"
version := "0.6.0-dt-20181102Z-3ee594"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "createjs-lib" % "0.0-unknown-dt-20181102Z-01c875",
  "com.scalablytyped" %%% "preloadjs" % "0.6.2-dt-20181102Z-4344cf",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        