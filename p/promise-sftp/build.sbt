organization := "org.scalablytyped"
name := "promise-sftp"
version := "1.3-dt-20180712Z-3a65b4"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-8f594d",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-e45326",
  "org.scalablytyped" %%% "promise-ftp-common" % "1.1-dt-20180709Z-145ab9",
  "org.scalablytyped" %%% "ssh2" % "v0.5.x-dt-20181128Z-46bb9f",
  "org.scalablytyped" %%% "ssh2-streams" % "v0.1.9-dt-20181129Z-988e2f",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        