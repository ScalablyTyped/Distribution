organization := "org.scalablytyped"
name := "redux-first-router"
version := "2.1-dt-20181128Z-e5cbd0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20190226Z-3ed5cf",
  "org.scalablytyped" %%% "redux" % "4.0.1-c1f77c",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-3596cc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        