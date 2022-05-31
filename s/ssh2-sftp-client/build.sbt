organization := "org.scalablytyped"
name := "ssh2-sftp-client"
version := "5.3-dt-20201001Z-22fd4e"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-11c649",
  "org.scalablytyped" %%% "ssh2" % "v0.5.x-dt-20201027Z-251211",
  "org.scalablytyped" %%% "ssh2-streams" % "v0.1.9-dt-20201002Z-da3146",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
