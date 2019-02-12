organization := "org.scalablytyped"
name := "ssh2-sftp-client"
version := "2.4-dt-20181129Z-ca18fa"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190211Z-6a64f2",
  "org.scalablytyped" %%% "ssh2" % "v0.5.x-dt-20190208Z-79654d",
  "org.scalablytyped" %%% "ssh2-streams" % "v0.1.9-dt-20190126Z-aa9bdc",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        