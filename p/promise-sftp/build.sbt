organization := "org.scalablytyped"
name := "promise-sftp"
version := "1.3-dt-20190819Z-64cf73"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20191014Z-44f16d",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191108Z-6cbaae",
  "org.scalablytyped" %%% "promise-ftp-common" % "1.1-dt-20180709Z-8ae0ac",
  "org.scalablytyped" %%% "ssh2" % "v0.5.x-dt-20190903Z-3fe55d",
  "org.scalablytyped" %%% "ssh2-streams" % "v0.1.9-dt-20190322Z-8ba3ce",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        