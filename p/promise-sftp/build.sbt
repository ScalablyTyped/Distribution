organization := "org.scalablytyped"
name := "promise-sftp"
version := "1.3-dt-20190819Z-7a00f9"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20191111Z-d528a7",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200117Z-4be21b",
  "org.scalablytyped" %%% "promise-ftp-common" % "1.1-dt-20180709Z-fa8c98",
  "org.scalablytyped" %%% "ssh2" % "v0.5.x-dt-20190903Z-520bb2",
  "org.scalablytyped" %%% "ssh2-streams" % "v0.1.9-dt-20190322Z-b204f0",
  "org.scalablytyped" %%% "std" % "3.7-96076c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        