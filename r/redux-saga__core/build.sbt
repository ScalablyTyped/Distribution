organization := "org.scalablytyped"
name := "redux-saga__core"
version := "1.0.2-7b0d28"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-bb7734",
  "org.scalablytyped" %%% "redux" % "4.0.1-c1f77c",
  "org.scalablytyped" %%% "redux-saga__deferred" % "1.0.1-b94680",
  "org.scalablytyped" %%% "redux-saga__delay-p" % "1.0.1-0d8f53",
  "org.scalablytyped" %%% "redux-saga__is" % "1.0.2-6ec63a",
  "org.scalablytyped" %%% "redux-saga__symbols" % "1.0.1-4c5f6c",
  "org.scalablytyped" %%% "redux-saga__types" % "1.0.2-969f0c",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-3596cc",
  "org.scalablytyped" %%% "typescript-compare" % "0.0.2-84ccc0",
  "org.scalablytyped" %%% "typescript-logic" % "0.0.0-5c203f",
  "org.scalablytyped" %%% "typescript-tuple" % "2.1.1-e71ac9")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        