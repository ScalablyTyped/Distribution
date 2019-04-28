organization := "org.scalablytyped"
name := "redux-first-router-restore-scroll"
version := "1.2-dt-20180428Z-805670"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20190322Z-f279a5",
  "org.scalablytyped" %%% "redux" % "4.0.1-99337b",
  "org.scalablytyped" %%% "redux-first-router" % "2.1-dt-20181128Z-5b1ddd",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        