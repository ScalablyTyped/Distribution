organization := "org.scalablytyped"
name := "redux-saga__is"
version := "1.0.0-6cd474"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-7438ae",
  "org.scalablytyped" %%% "redux" % "4.0.1-0f174c",
  "org.scalablytyped" %%% "redux-saga__symbols" % "1.0.0-365917",
  "org.scalablytyped" %%% "redux-saga__types" % "1.0.0-d7b6c0",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-bc5916")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        