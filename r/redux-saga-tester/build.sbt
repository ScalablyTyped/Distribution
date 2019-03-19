organization := "org.scalablytyped"
name := "redux-saga-tester"
version := "1.0-dt-20181130Z-ca50d7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190318Z-f6d9fe",
  "org.scalablytyped" %%% "redux" % "4.0.1-18f3a8",
  "org.scalablytyped" %%% "redux-saga" % "1.0.2-7eacc5",
  "org.scalablytyped" %%% "redux-saga__core" % "1.0.2-a7dabc",
  "org.scalablytyped" %%% "redux-saga__deferred" % "1.0.1-955936",
  "org.scalablytyped" %%% "redux-saga__delay-p" % "1.0.1-78d000",
  "org.scalablytyped" %%% "redux-saga__is" % "1.0.2-623007",
  "org.scalablytyped" %%% "redux-saga__symbols" % "1.0.1-799294",
  "org.scalablytyped" %%% "redux-saga__types" % "1.0.2-b281d6",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-5b665c",
  "org.scalablytyped" %%% "typescript-compare" % "0.0.2-8c66a0",
  "org.scalablytyped" %%% "typescript-logic" % "0.0.0-2549e7",
  "org.scalablytyped" %%% "typescript-tuple" % "2.2.1-0d20e2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        