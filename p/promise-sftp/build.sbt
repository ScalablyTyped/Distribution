organization := "org.scalablytyped"
name := "promise-sftp"
version := "1.3-dt-20180712Z-a324b6"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-a33d29",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2aa425",
  "org.scalablytyped" %%% "promise-ftp-common" % "1.1-dt-20180709Z-8b8b39",
  "org.scalablytyped" %%% "ssh2" % "v0.5.x-dt-20181128Z-50bc4d",
  "org.scalablytyped" %%% "ssh2-streams" % "v0.1.9-dt-20181129Z-254229",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        