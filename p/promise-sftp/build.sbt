organization := "org.scalablytyped"
name := "promise-sftp"
version := "1.3-dt-20180910Z-99ec8f"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20180910Z-b88fdf",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-df5d12",
  "org.scalablytyped" %%% "promise-ftp-common" % "1.1-dt-20180910Z-70af8a",
  "org.scalablytyped" %%% "ssh2" % "v0.5.x-dt-20181204Z-2df237",
  "org.scalablytyped" %%% "ssh2-streams" % "v0.1.9-dt-20181204Z-7b8c4f",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        