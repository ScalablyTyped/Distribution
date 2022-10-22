organization := "org.scalablytyped"
name := "promise-sftp"
version := "1.3-dt-20211202Z-d19e4f"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20220923Z-463b2d",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "promise-ftp-common" % "1.1-dt-20211202Z-f1925d",
  "org.scalablytyped" %%% "ssh2" % "v1.11-dt-20220930Z-0b4949",
  "org.scalablytyped" %%% "ssh2-streams" % "v0.1.9-dt-20220818Z-f46bad",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
