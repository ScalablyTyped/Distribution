organization := "org.scalablytyped"
name := "promise-sftp"
version := "1.3-dt-20190819Z-85ac9c"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20200302Z-2fc7af",
  "org.scalablytyped" %%% "node" % "13.11-dt-20200402Z-9a87f0",
  "org.scalablytyped" %%% "promise-ftp-common" % "1.1-dt-20180709Z-42125a",
  "org.scalablytyped" %%% "ssh2" % "v0.5.x-dt-20200331Z-83fdeb",
  "org.scalablytyped" %%% "ssh2-streams" % "v0.1.9-dt-20200227Z-f56ee5",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
