organization := "org.scalablytyped"
name := "slack-winston"
version := "0.0-dt-20180927Z-c27016"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.0.1-dt-20181020Z-c71af2",
  "org.scalablytyped" %%% "is-stream" % "1.1-dt-20180910Z-9ef893",
  "org.scalablytyped" %%% "logform" % "1.2-dt-20180910Z-901b5f",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-646a31",
  "org.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20180910Z-e2b59e",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b",
  "org.scalablytyped" %%% "triple-beam" % "1.3-dt-20180910Z-f5c351",
  "org.scalablytyped" %%% "winston" % "3.1.0-4d03ad",
  "org.scalablytyped" %%% "winston-transport" % "4.2.0-08fbaa")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        