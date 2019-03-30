organization := "org.scalablytyped"
name := "redux-saga__core"
version := "1.0.2-f3a74d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "node" % "11.12-dt-20190330Z-e2b8de",
  "org.scalablytyped" %%% "redux" % "4.0.1-caedab",
  "org.scalablytyped" %%% "redux-saga__deferred" % "1.0.1-ab7264",
  "org.scalablytyped" %%% "redux-saga__delay-p" % "1.0.1-44afb6",
  "org.scalablytyped" %%% "redux-saga__is" % "1.0.2-6337ed",
  "org.scalablytyped" %%% "redux-saga__symbols" % "1.0.1-819f5c",
  "org.scalablytyped" %%% "redux-saga__types" % "1.0.2-95d680",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-a7455c",
  "org.scalablytyped" %%% "typescript-compare" % "0.0.2-268729",
  "org.scalablytyped" %%% "typescript-logic" % "0.0.0-1ffc84",
  "org.scalablytyped" %%% "typescript-tuple" % "2.2.1-39e848")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        