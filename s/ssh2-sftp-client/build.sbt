organization := "org.scalablytyped"
name := "ssh2-sftp-client"
version := "2.4-dt-20181129Z-e6ef6c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-8da1df",
  "org.scalablytyped" %%% "ssh2" % "v0.5.x-dt-20181128Z-b1ddad",
  "org.scalablytyped" %%% "ssh2-streams" % "v0.1.9-dt-20190126Z-d234dc",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        