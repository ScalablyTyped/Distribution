organization := "org.scalablytyped"
name := "redux-first-router-restore-scroll"
version := "1.2-dt-20180428Z-8129d7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20181017Z-06a130",
  "org.scalablytyped" %%% "redux" % "4.0.1-44220d",
  "org.scalablytyped" %%% "redux-first-router" % "2.1-dt-20181128Z-1def5f",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-e21f3d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        