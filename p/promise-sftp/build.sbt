organization := "com.scalablytyped"
name := "promise-sftp"
version := "1.3-dt-20180910Z-6424f0"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "bluebird" % "3.5-dt-20180910Z-3124ce",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-cadd20",
  "com.scalablytyped" %%% "promise-ftp-common" % "1.1-dt-20180910Z-f34e30",
  "com.scalablytyped" %%% "ssh2" % "v0.5.x-dt-20181120Z-e860cb",
  "com.scalablytyped" %%% "ssh2-streams" % "v0.1.9-dt-20181120Z-839fed",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        