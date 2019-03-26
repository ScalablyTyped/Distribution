organization := "org.scalablytyped"
name := "promise-pg"
version := "0.0-unknown-dt-20190322Z-acf2ec"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "moment" % "2.24.0-584f36",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "pg" % "7.4-dt-20190319Z-d00a25",
  "org.scalablytyped" %%% "pg-types" % "1.11-dt-20180214Z-728994",
  "org.scalablytyped" %%% "q" % "1.5-dt-20190313Z-ead32a",
  "org.scalablytyped" %%% "std" % "3.3-14e863")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        