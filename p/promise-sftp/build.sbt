organization := "org.scalablytyped"
name := "promise-sftp"
version := "1.3-dt-20180712Z-c74e1b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-232ecf",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-7438ae",
  "org.scalablytyped" %%% "promise-ftp-common" % "1.1-dt-20180709Z-f5e6ca",
  "org.scalablytyped" %%% "ssh2" % "v0.5.x-dt-20181128Z-5e42b8",
  "org.scalablytyped" %%% "ssh2-streams" % "v0.1.9-dt-20181129Z-665343",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        