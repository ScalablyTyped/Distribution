organization := "org.scalablytyped"
name := "promise-sftp"
version := "1.3-dt-20180712Z-cb5bdd"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-ef7d03",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-92720c",
  "org.scalablytyped" %%% "promise-ftp-common" % "1.1-dt-20180709Z-1cbda0",
  "org.scalablytyped" %%% "ssh2" % "v0.5.x-dt-20181128Z-032254",
  "org.scalablytyped" %%% "ssh2-streams" % "v0.1.9-dt-20190126Z-239e85",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        