organization := "org.scalablytyped"
name := "promise-sftp"
version := "1.3-dt-20190819Z-dea7f8"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20191111Z-21097f",
  "org.scalablytyped" %%% "node" % "13.1-dt-20191226Z-155d58",
  "org.scalablytyped" %%% "promise-ftp-common" % "1.1-dt-20180709Z-1d2d5f",
  "org.scalablytyped" %%% "ssh2" % "v0.5.x-dt-20190903Z-dbc934",
  "org.scalablytyped" %%% "ssh2-streams" % "v0.1.9-dt-20190322Z-1da86b",
  "org.scalablytyped" %%% "std" % "3.7-953338")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        