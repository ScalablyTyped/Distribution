organization := "org.scalablytyped"
name := "promise-sftp"
version := "1.3-dt-20180712Z-108971"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-0bae51",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190502Z-d681c7",
  "org.scalablytyped" %%% "promise-ftp-common" % "1.1-dt-20180709Z-9b7dcb",
  "org.scalablytyped" %%% "ssh2" % "v0.5.x-dt-20190322Z-280cb8",
  "org.scalablytyped" %%% "ssh2-streams" % "v0.1.9-dt-20190322Z-f915c3",
  "org.scalablytyped" %%% "std" % "3.4-495f93")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        