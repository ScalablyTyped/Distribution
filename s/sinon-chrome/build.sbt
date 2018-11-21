organization := "com.scalablytyped"
name := "sinon-chrome"
version := "v2.2.4-dt-20181120Z-74e7b3"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "chrome" % "0.0-unknown-dt-20181120Z-07ddbd",
  "com.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20180910Z-a7b49f",
  "com.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20180910Z-126da6",
  "com.scalablytyped" %%% "sinon" % "5.0-dt-20181120Z-4fd1ec",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        