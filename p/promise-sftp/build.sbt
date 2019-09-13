organization := "org.scalablytyped"
name := "promise-sftp"
version := "1.3-dt-20190819Z-ff4f4f"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190524Z-183d02",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190911Z-da4655",
  "org.scalablytyped" %%% "promise-ftp-common" % "1.1-dt-20180709Z-82ff45",
  "org.scalablytyped" %%% "ssh2" % "v0.5.x-dt-20190903Z-f912ca",
  "org.scalablytyped" %%% "ssh2-streams" % "v0.1.9-dt-20190322Z-d0c9b3",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        