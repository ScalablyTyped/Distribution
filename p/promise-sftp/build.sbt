organization := "org.scalablytyped"
name := "promise-sftp"
version := "1.3-dt-20211202Z-b37dd0"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20220923Z-c67867",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "promise-ftp-common" % "1.1-dt-20211202Z-521f71",
  "org.scalablytyped" %%% "ssh2" % "v1.11-dt-20220930Z-faac21",
  "org.scalablytyped" %%% "ssh2-streams" % "v0.1.9-dt-20220818Z-32dc75",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
