organization := "org.scalablytyped"
name := "promise-sftp"
version := "1.3-dt-20180910Z-6c108f"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20180910Z-98d464",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-646a31",
  "org.scalablytyped" %%% "promise-ftp-common" % "1.1-dt-20180910Z-9f6574",
  "org.scalablytyped" %%% "ssh2" % "v0.5.x-dt-20181204Z-74af0a",
  "org.scalablytyped" %%% "ssh2-streams" % "v0.1.9-dt-20181204Z-170404",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        