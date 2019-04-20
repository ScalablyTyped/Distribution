organization := "org.scalablytyped"
name := "promise-sftp"
version := "1.3-dt-20180712Z-d5677c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-e9bc8b",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190419Z-3f0246",
  "org.scalablytyped" %%% "promise-ftp-common" % "1.1-dt-20180709Z-6c8b84",
  "org.scalablytyped" %%% "ssh2" % "v0.5.x-dt-20190322Z-496fb9",
  "org.scalablytyped" %%% "ssh2-streams" % "v0.1.9-dt-20190322Z-4c2b4e",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        