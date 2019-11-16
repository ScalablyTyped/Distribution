organization := "org.scalablytyped"
name := "promise-sftp"
version := "1.3-dt-20190819Z-d5b509"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20191111Z-35b9bf",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191115Z-3b62fb",
  "org.scalablytyped" %%% "promise-ftp-common" % "1.1-dt-20180709Z-8ae0ac",
  "org.scalablytyped" %%% "ssh2" % "v0.5.x-dt-20190903Z-bd7f75",
  "org.scalablytyped" %%% "ssh2-streams" % "v0.1.9-dt-20190322Z-612907",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        