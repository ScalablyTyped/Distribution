organization := "com.scalablytyped"
name := "sinon-chrome"
version := "v2.2.4-dt-20181120Z-2d2fdd"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "chrome" % "0.0-unknown-dt-20181120Z-59b60d",
  "com.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20180910Z-c6b91a",
  "com.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20180910Z-807cfc",
  "com.scalablytyped" %%% "sinon" % "5.0-dt-20181120Z-d75ff9",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        