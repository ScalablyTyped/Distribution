organization := "org.scalablytyped"
name := "promise-sftp"
version := "1.3-dt-20211202Z-673622"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20220923Z-463b2d",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221015Z-0a42ca",
  "org.scalablytyped" %%% "promise-ftp-common" % "1.1-dt-20211202Z-f1925d",
  "org.scalablytyped" %%% "ssh2" % "v1.11-dt-20220930Z-c9f3f7",
  "org.scalablytyped" %%% "ssh2-streams" % "v0.1.9-dt-20220818Z-dcee98",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
