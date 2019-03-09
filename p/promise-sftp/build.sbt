organization := "org.scalablytyped"
name := "promise-sftp"
version := "1.3-dt-20180712Z-679ab6"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-865309",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190307Z-7720a8",
  "org.scalablytyped" %%% "promise-ftp-common" % "1.1-dt-20180709Z-9ef41b",
  "org.scalablytyped" %%% "ssh2" % "v0.5.x-dt-20190227Z-d35533",
  "org.scalablytyped" %%% "ssh2-streams" % "v0.1.9-dt-20190218Z-09da5c",
  "org.scalablytyped" %%% "std" % "3.3-05be79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        