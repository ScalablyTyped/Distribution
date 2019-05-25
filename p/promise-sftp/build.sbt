organization := "org.scalablytyped"
name := "promise-sftp"
version := "1.3-dt-20190524Z-21144a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190524Z-e943e4",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190517Z-07594f",
  "org.scalablytyped" %%% "promise-ftp-common" % "1.1-dt-20180709Z-628e7e",
  "org.scalablytyped" %%% "ssh2" % "v0.5.x-dt-20190322Z-f93fef",
  "org.scalablytyped" %%% "ssh2-streams" % "v0.1.9-dt-20190322Z-fc3e17",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        