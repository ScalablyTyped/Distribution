organization := "org.scalablytyped"
name := "promise-sftp"
version := "1.3-dt-20211202Z-7faa8d"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20221103Z-5a7a5b",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-d0f137",
  "org.scalablytyped" %%% "promise-ftp-common" % "1.1-dt-20211202Z-a57f6a",
  "org.scalablytyped" %%% "ssh2" % "v1.11-dt-20221103Z-6ae419",
  "org.scalablytyped" %%% "ssh2-streams" % "v0.1.9-dt-20220818Z-d60772",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
