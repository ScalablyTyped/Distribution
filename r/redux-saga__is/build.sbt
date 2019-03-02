organization := "org.scalablytyped"
name := "redux-saga__is"
version := "1.0.2-6ec63a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-bb7734",
  "org.scalablytyped" %%% "redux" % "4.0.1-c1f77c",
  "org.scalablytyped" %%% "redux-saga__symbols" % "1.0.1-4c5f6c",
  "org.scalablytyped" %%% "redux-saga__types" % "1.0.2-969f0c",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-3596cc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        