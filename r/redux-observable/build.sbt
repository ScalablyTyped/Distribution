organization := "org.scalablytyped"
name := "redux-observable"
version := "1.0.0-d5f958"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "redux" % "4.0.1-0f174c",
  "org.scalablytyped" %%% "rxjs" % "6.4.0-183567",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-bc5916",
  "org.scalablytyped" %%% "tslib" % "1.9.3-688770")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        