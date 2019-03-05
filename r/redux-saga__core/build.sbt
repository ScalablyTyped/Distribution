organization := "org.scalablytyped"
name := "redux-saga__core"
version := "1.0.2-1865aa"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-fd0a52",
  "org.scalablytyped" %%% "redux" % "4.0.1-03a2e6",
  "org.scalablytyped" %%% "redux-saga__deferred" % "1.0.1-223a7b",
  "org.scalablytyped" %%% "redux-saga__delay-p" % "1.0.1-a1896a",
  "org.scalablytyped" %%% "redux-saga__is" % "1.0.2-b7335b",
  "org.scalablytyped" %%% "redux-saga__symbols" % "1.0.1-bf3e45",
  "org.scalablytyped" %%% "redux-saga__types" % "1.0.2-2b7a0d",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-bfac6c",
  "org.scalablytyped" %%% "typescript-compare" % "0.0.2-0fa312",
  "org.scalablytyped" %%% "typescript-logic" % "0.0.0-205c84",
  "org.scalablytyped" %%% "typescript-tuple" % "2.2.0-4b07ca")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        