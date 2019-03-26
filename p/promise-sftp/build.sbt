organization := "org.scalablytyped"
name := "promise-sftp"
version := "1.3-dt-20180712Z-02faaa"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-d754c7",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "promise-ftp-common" % "1.1-dt-20180709Z-294c9e",
  "org.scalablytyped" %%% "ssh2" % "v0.5.x-dt-20190322Z-199587",
  "org.scalablytyped" %%% "ssh2-streams" % "v0.1.9-dt-20190322Z-08b77e",
  "org.scalablytyped" %%% "std" % "3.3-14e863")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        