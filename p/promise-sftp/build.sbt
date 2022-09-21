organization := "org.scalablytyped"
name := "promise-sftp"
version := "1.3-dt-20211202Z-50b7c4"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20220819Z-8ddcaa",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "promise-ftp-common" % "1.1-dt-20211202Z-25619f",
  "org.scalablytyped" %%% "ssh2" % "v1.11-dt-20220818Z-ae8d9c",
  "org.scalablytyped" %%% "ssh2-streams" % "v0.1.9-dt-20220818Z-bc61b5",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
