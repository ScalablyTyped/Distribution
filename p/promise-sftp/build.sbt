organization := "org.scalablytyped"
name := "promise-sftp"
version := "1.3-dt-20200515Z-d019e7"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20200520Z-32ab28",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200521Z-3aabb7",
  "org.scalablytyped" %%% "promise-ftp-common" % "1.1-dt-20180709Z-3bfca3",
  "org.scalablytyped" %%% "ssh2" % "v0.5.x-dt-20200515Z-f58955",
  "org.scalablytyped" %%% "ssh2-streams" % "v0.1.9-dt-20200515Z-8fd28c",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
