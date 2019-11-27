organization := "org.scalablytyped"
name := "promise-sftp"
version := "1.3-dt-20190819Z-6d127c"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20191111Z-104ef4",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191126Z-08e889",
  "org.scalablytyped" %%% "promise-ftp-common" % "1.1-dt-20180709Z-e3ad5a",
  "org.scalablytyped" %%% "ssh2" % "v0.5.x-dt-20190903Z-94838c",
  "org.scalablytyped" %%% "ssh2-streams" % "v0.1.9-dt-20190322Z-7e268b",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        