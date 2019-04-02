organization := "org.scalablytyped"
name := "promise-sftp"
version := "1.3-dt-20180712Z-dbf4b8"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-986805",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190330Z-7c1cfd",
  "org.scalablytyped" %%% "promise-ftp-common" % "1.1-dt-20180709Z-14879c",
  "org.scalablytyped" %%% "ssh2" % "v0.5.x-dt-20190322Z-fd9f3a",
  "org.scalablytyped" %%% "ssh2-streams" % "v0.1.9-dt-20190322Z-badfb3",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        