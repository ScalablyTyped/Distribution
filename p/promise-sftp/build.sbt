organization := "com.scalablytyped"
name := "promise-sftp"
version := "1.3-dt-20180910Z-1812d9"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "bluebird" % "3.5-dt-20180910Z-7bd99a",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181203Z-7004b3",
  "com.scalablytyped" %%% "promise-ftp-common" % "1.1-dt-20180910Z-1b3c28",
  "com.scalablytyped" %%% "ssh2" % "v0.5.x-dt-20181120Z-915bc8",
  "com.scalablytyped" %%% "ssh2-streams" % "v0.1.9-dt-20181120Z-d27a45",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        