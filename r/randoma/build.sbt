organization := "org.scalablytyped"
name := "randoma"
version := "1.2-dt-20181209Z-11ee7d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "color" % "3.0-dt-20180214Z-c2ba46",
  "org.scalablytyped" %%% "color-convert" % "1.9-dt-20180214Z-04513f",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180214Z-58487f",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        