organization := "org.scalablytyped"
name := "promise-sftp"
version := "1.3-dt-20180712Z-239cec"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-03fd26",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-77ce7e",
  "org.scalablytyped" %%% "promise-ftp-common" % "1.1-dt-20180709Z-a2fe5c",
  "org.scalablytyped" %%% "ssh2" % "v0.5.x-dt-20181128Z-3becd4",
  "org.scalablytyped" %%% "ssh2-streams" % "v0.1.9-dt-20181129Z-59d4ad",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        