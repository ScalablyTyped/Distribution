organization := "org.scalablytyped"
name := "redux-saga-tester"
version := "1.0-dt-20181130Z-3b88dc"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "redux" % "4.0.1-436f26",
  "org.scalablytyped" %%% "redux-saga" % "1.0.2-ac997c",
  "org.scalablytyped" %%% "redux-saga__core" % "1.0.2-76468c",
  "org.scalablytyped" %%% "redux-saga__deferred" % "1.0.1-1ac24a",
  "org.scalablytyped" %%% "redux-saga__delay-p" % "1.0.1-9641ea",
  "org.scalablytyped" %%% "redux-saga__is" % "1.0.2-f9dc2b",
  "org.scalablytyped" %%% "redux-saga__symbols" % "1.0.1-b4720b",
  "org.scalablytyped" %%% "redux-saga__types" % "1.0.2-10e30d",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-1f290b",
  "org.scalablytyped" %%% "typescript-compare" % "0.0.2-157938",
  "org.scalablytyped" %%% "typescript-logic" % "0.0.0-822159",
  "org.scalablytyped" %%% "typescript-tuple" % "2.2.1-a40bec")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        