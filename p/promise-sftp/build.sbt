organization := "org.scalablytyped"
name := "promise-sftp"
version := "1.3-dt-20180712Z-8f50f3"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-04358d",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190215Z-604ea6",
  "org.scalablytyped" %%% "promise-ftp-common" % "1.1-dt-20180709Z-00359b",
  "org.scalablytyped" %%% "ssh2" % "v0.5.x-dt-20190215Z-246cbc",
  "org.scalablytyped" %%% "ssh2-streams" % "v0.1.9-dt-20190126Z-91cb67",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        