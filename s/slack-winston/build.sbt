organization := "org.scalablytyped"
name := "slack-winston"
version := "0.0-dt-20180927Z-d943f2"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.0.1-dt-20181020Z-42f75e",
  "org.scalablytyped" %%% "is-stream" % "1.1-dt-20180910Z-014c96",
  "org.scalablytyped" %%% "logform" % "1.2-dt-20180910Z-de63ec",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-d9c01e",
  "org.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20180910Z-fb7118",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b",
  "org.scalablytyped" %%% "triple-beam" % "1.3-dt-20180910Z-09798f",
  "org.scalablytyped" %%% "winston" % "3.1.0-e6022c",
  "org.scalablytyped" %%% "winston-transport" % "4.2.0-d707c2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        