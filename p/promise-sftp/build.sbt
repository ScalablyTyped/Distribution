organization := "org.scalablytyped"
name := "promise-sftp"
version := "1.3-dt-20190819Z-c81aee"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20200302Z-5cd42f",
  "org.scalablytyped" %%% "node" % "13.13-dt-20200417Z-f3d81d",
  "org.scalablytyped" %%% "promise-ftp-common" % "1.1-dt-20180709Z-12862e",
  "org.scalablytyped" %%% "ssh2" % "v0.5.x-dt-20200410Z-7c22db",
  "org.scalablytyped" %%% "ssh2-streams" % "v0.1.9-dt-20200227Z-0443ea",
  "org.scalablytyped" %%% "std" % "3.8-9b2470")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
