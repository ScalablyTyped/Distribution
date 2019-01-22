organization := "org.scalablytyped"
name := "redux-saga__core"
version := "1.0.0-ea53c6"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-7438ae",
  "org.scalablytyped" %%% "redux" % "4.0.1-0f174c",
  "org.scalablytyped" %%% "redux-saga__deferred" % "1.0.0-756e4f",
  "org.scalablytyped" %%% "redux-saga__delay-p" % "1.0.0-975781",
  "org.scalablytyped" %%% "redux-saga__is" % "1.0.0-6cd474",
  "org.scalablytyped" %%% "redux-saga__symbols" % "1.0.0-365917",
  "org.scalablytyped" %%% "redux-saga__types" % "1.0.0-d7b6c0",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-bc5916",
  "org.scalablytyped" %%% "typescript-compare" % "0.0.2-2e5e2d",
  "org.scalablytyped" %%% "typescript-logic" % "0.0.0-1d3ccf",
  "org.scalablytyped" %%% "typescript-tuple" % "2.1.0-f70023")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        