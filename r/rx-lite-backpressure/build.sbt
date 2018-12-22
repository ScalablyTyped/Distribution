organization := "org.scalablytyped"
name := "rx-lite-backpressure"
version := "4.0-dt-20180214Z-82424d"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20180214Z-88559c",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20180214Z-75edf5",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20181017Z-156ef4",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        