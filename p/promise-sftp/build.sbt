organization := "org.scalablytyped"
name := "promise-sftp"
version := "1.3-dt-20211202Z-87b1a4"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20221103Z-6d7ec9",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "promise-ftp-common" % "1.1-dt-20211202Z-dee3a3",
  "org.scalablytyped" %%% "ssh2" % "v1.11-dt-20221103Z-acbd5d",
  "org.scalablytyped" %%% "ssh2-streams" % "v0.1.9-dt-20220818Z-67b090",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
