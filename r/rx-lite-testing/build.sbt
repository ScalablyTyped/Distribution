organization := "org.scalablytyped"
name := "rx-lite-testing"
version := "4.0-dt-20180214Z-54ea62"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20180214Z-b40c6d",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20180214Z-2a0c96",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20181017Z-9f13fc",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20180214Z-a5b4e8",
  "org.scalablytyped" %%% "std" % "3.3-6e4388")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        