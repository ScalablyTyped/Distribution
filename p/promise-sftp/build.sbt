organization := "org.scalablytyped"
name := "promise-sftp"
version := "1.3-dt-20180910Z-fda07d"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181214Z-21934a",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-702cdc",
  "org.scalablytyped" %%% "promise-ftp-common" % "1.1-dt-20180910Z-4b54c7",
  "org.scalablytyped" %%% "ssh2" % "v0.5.x-dt-20181204Z-0aae30",
  "org.scalablytyped" %%% "ssh2-streams" % "v0.1.9-dt-20181204Z-5ce2de",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        