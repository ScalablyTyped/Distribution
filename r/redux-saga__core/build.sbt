organization := "org.scalablytyped"
name := "redux-saga__core"
version := "1.0.1-c3429b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190213Z-0d969a",
  "org.scalablytyped" %%% "redux" % "4.0.1-8c6a2a",
  "org.scalablytyped" %%% "redux-saga__deferred" % "1.0.1-0bd734",
  "org.scalablytyped" %%% "redux-saga__delay-p" % "1.0.1-fe91eb",
  "org.scalablytyped" %%% "redux-saga__is" % "1.0.1-c2955e",
  "org.scalablytyped" %%% "redux-saga__symbols" % "1.0.1-411e54",
  "org.scalablytyped" %%% "redux-saga__types" % "1.0.0-11a27f",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-31ba1a",
  "org.scalablytyped" %%% "typescript-compare" % "0.0.2-8db8e6",
  "org.scalablytyped" %%% "typescript-logic" % "0.0.0-c0ce9f",
  "org.scalablytyped" %%% "typescript-tuple" % "2.1.1-b80193")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        