organization := "com.scalablytyped"
name := "promise-sftp"
version := "1.3-dt-20180910Z-113bbc"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "bluebird" % "3.5-dt-20180910Z-7bd99a",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181129Z-9f7a18",
  "com.scalablytyped" %%% "promise-ftp-common" % "1.1-dt-20180910Z-1b3c28",
  "com.scalablytyped" %%% "ssh2" % "v0.5.x-dt-20181120Z-3615f3",
  "com.scalablytyped" %%% "ssh2-streams" % "v0.1.9-dt-20181120Z-7f6a1c",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        