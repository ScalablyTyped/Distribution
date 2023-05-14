organization := "org.scalablytyped"
name := "promise-sftp"
version := "1.3-dt-20211202Z-90541c"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20230328Z-ea1cbb",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "promise-ftp-common" % "1.1-dt-20211202Z-73e0d2",
  "org.scalablytyped" %%% "ssh2" % "1.11-dt-20230411Z-dd83d7",
  "org.scalablytyped" %%% "ssh2-streams" % "v0.1.9-dt-20220818Z-20ec64",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
