organization := "org.scalablytyped"
name := "redux-saga__core"
version := "1.0.1-700dc5"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-8da1df",
  "org.scalablytyped" %%% "redux" % "4.0.1-607317",
  "org.scalablytyped" %%% "redux-saga__deferred" % "1.0.1-27fa7d",
  "org.scalablytyped" %%% "redux-saga__delay-p" % "1.0.1-e3bbf3",
  "org.scalablytyped" %%% "redux-saga__is" % "1.0.1-ea1f5f",
  "org.scalablytyped" %%% "redux-saga__symbols" % "1.0.1-4fdab4",
  "org.scalablytyped" %%% "redux-saga__types" % "1.0.0-10c299",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-607a2a",
  "org.scalablytyped" %%% "typescript-compare" % "0.0.2-3bf696",
  "org.scalablytyped" %%% "typescript-logic" % "0.0.0-955b59",
  "org.scalablytyped" %%% "typescript-tuple" % "2.1.0-8a32f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        