organization := "org.scalablytyped"
name := "promise-sftp"
version := "1.3-dt-20200515Z-b9e9c8"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20201028Z-8d4fd2",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-50d3d9",
  "org.scalablytyped" %%% "promise-ftp-common" % "1.1-dt-20180709Z-af0d27",
  "org.scalablytyped" %%% "ssh2" % "v0.5.x-dt-20201027Z-815a13",
  "org.scalablytyped" %%% "ssh2-streams" % "v0.1.9-dt-20201002Z-a2fccb",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
