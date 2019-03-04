organization := "org.scalablytyped"
name := "rx-lite-coincidence"
version := "4.0-dt-20180214Z-a185ef"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20180214Z-0ff5f4",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20180214Z-073684",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20181017Z-c6a1ff",
  "org.scalablytyped" %%% "std" % "3.3-05be79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        