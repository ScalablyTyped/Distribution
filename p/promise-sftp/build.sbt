organization := "org.scalablytyped"
name := "promise-sftp"
version := "1.3-dt-20200515Z-d0b593"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20201028Z-86bb8c",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "promise-ftp-common" % "1.1-dt-20180709Z-cbae8f",
  "org.scalablytyped" %%% "ssh2" % "v0.5.x-dt-20201027Z-516913",
  "org.scalablytyped" %%% "ssh2-streams" % "v0.1.9-dt-20201002Z-ce8154",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
