organization := "org.scalablytyped"
name := "redux-first-router-restore-scroll"
version := "1.2-dt-20180428Z-0a457d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20181017Z-bd3077",
  "org.scalablytyped" %%% "redux" % "4.0.1-8c6a2a",
  "org.scalablytyped" %%% "redux-first-router" % "2.1-dt-20181128Z-23551f",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-31ba1a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        