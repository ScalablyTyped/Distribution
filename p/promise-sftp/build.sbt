organization := "org.scalablytyped"
name := "promise-sftp"
version := "1.3-dt-20190819Z-ae8727"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20191014Z-347560",
  "org.scalablytyped" %%% "node" % "12.11-dt-20191021Z-a8dc6e",
  "org.scalablytyped" %%% "promise-ftp-common" % "1.1-dt-20180709Z-bc5c06",
  "org.scalablytyped" %%% "ssh2" % "v0.5.x-dt-20190903Z-3eee5b",
  "org.scalablytyped" %%% "ssh2-streams" % "v0.1.9-dt-20190322Z-af9952",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        