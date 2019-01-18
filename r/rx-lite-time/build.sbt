organization := "org.scalablytyped"
name := "rx-lite-time"
version := "4.0-dt-20180214Z-658d5c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20180214Z-dd641d",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20180214Z-c800a8",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20181017Z-5dc046",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        