organization := "org.scalablytyped"
name := "promise-sftp"
version := "1.3-dt-20190819Z-9a8b22"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190524Z-0c9c39",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190820Z-2dc4df",
  "org.scalablytyped" %%% "promise-ftp-common" % "1.1-dt-20180709Z-96e173",
  "org.scalablytyped" %%% "ssh2" % "v0.5.x-dt-20190322Z-e63a09",
  "org.scalablytyped" %%% "ssh2-streams" % "v0.1.9-dt-20190322Z-1f9eb7",
  "org.scalablytyped" %%% "std" % "3.5-cd493c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        