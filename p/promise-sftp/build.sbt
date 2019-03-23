organization := "org.scalablytyped"
name := "promise-sftp"
version := "1.3-dt-20180712Z-0f5351"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-cc7043",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190322Z-28a0c1",
  "org.scalablytyped" %%% "promise-ftp-common" % "1.1-dt-20180709Z-6a9b33",
  "org.scalablytyped" %%% "ssh2" % "v0.5.x-dt-20190322Z-cbd9b9",
  "org.scalablytyped" %%% "ssh2-streams" % "v0.1.9-dt-20190322Z-73c187",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        