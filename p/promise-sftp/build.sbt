organization := "org.scalablytyped"
name := "promise-sftp"
version := "1.3-dt-20190524Z-f3d5d4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190524Z-aebf09",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190703Z-a67e53",
  "org.scalablytyped" %%% "promise-ftp-common" % "1.1-dt-20180709Z-d4bcd7",
  "org.scalablytyped" %%% "ssh2" % "v0.5.x-dt-20190322Z-6ee8c1",
  "org.scalablytyped" %%% "ssh2-streams" % "v0.1.9-dt-20190322Z-8e28a6",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        