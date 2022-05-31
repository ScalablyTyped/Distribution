organization := "org.scalablytyped"
name := "promise-sftp"
version := "1.3-dt-20200515Z-9f8b70"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20201028Z-8f0838",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-11c649",
  "org.scalablytyped" %%% "promise-ftp-common" % "1.1-dt-20180709Z-3e78ea",
  "org.scalablytyped" %%% "ssh2" % "v0.5.x-dt-20201027Z-251211",
  "org.scalablytyped" %%% "ssh2-streams" % "v0.1.9-dt-20201002Z-da3146",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
