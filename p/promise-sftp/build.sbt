organization := "org.scalablytyped"
name := "promise-sftp"
version := "1.3-dt-20180712Z-3084d0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-cbbf17",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-bb7734",
  "org.scalablytyped" %%% "promise-ftp-common" % "1.1-dt-20180709Z-0011b4",
  "org.scalablytyped" %%% "ssh2" % "v0.5.x-dt-20190227Z-5890dd",
  "org.scalablytyped" %%% "ssh2-streams" % "v0.1.9-dt-20190126Z-264b05",
  "org.scalablytyped" %%% "std" % "3.3-6e4388")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        