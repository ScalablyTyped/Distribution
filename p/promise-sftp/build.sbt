organization := "org.scalablytyped"
name := "promise-sftp"
version := "1.3-dt-20190524Z-48a5bb"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190524Z-1ea477",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190621Z-8f9d23",
  "org.scalablytyped" %%% "promise-ftp-common" % "1.1-dt-20180709Z-2f18b8",
  "org.scalablytyped" %%% "ssh2" % "v0.5.x-dt-20190322Z-b437c9",
  "org.scalablytyped" %%% "ssh2-streams" % "v0.1.9-dt-20190322Z-9fc22b",
  "org.scalablytyped" %%% "std" % "3.5-d4a303")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        