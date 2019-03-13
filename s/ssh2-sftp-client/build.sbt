organization := "org.scalablytyped"
name := "ssh2-sftp-client"
version := "2.4-dt-20190212Z-1fa4b6"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190312Z-f6d9fe",
  "org.scalablytyped" %%% "ssh2" % "v0.5.x-dt-20190227Z-d2b5ad",
  "org.scalablytyped" %%% "ssh2-streams" % "v0.1.9-dt-20190218Z-f9d7c7",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        