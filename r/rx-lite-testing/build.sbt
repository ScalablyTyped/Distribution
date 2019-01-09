organization := "org.scalablytyped"
name := "rx-lite-testing"
version := "4.0-dt-20180214Z-c7354c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20180214Z-cf02c5",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20180214Z-b2d51c",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20181017Z-b8adfd",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20180214Z-2c1602",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        