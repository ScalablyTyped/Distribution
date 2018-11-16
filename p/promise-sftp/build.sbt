organization := "com.scalablytyped"
name := "promise-sftp"
version := "1.3-dt-20181102Z-a88e40"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "bluebird" % "3.5-dt-20181102Z-6d07df",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-806eaf",
  "com.scalablytyped" %%% "promise-ftp-common" % "1.1-dt-20181102Z-cd5f06",
  "com.scalablytyped" %%% "ssh2" % "v0.5.x-dt-20181102Z-4ccca0",
  "com.scalablytyped" %%% "ssh2-streams" % "v0.1.9-dt-20181102Z-b322f7",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        