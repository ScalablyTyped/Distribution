organization := "org.scalablytyped"
name := "promise-sftp"
version := "1.3-dt-20190524Z-1d4530"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190524Z-cca586",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-76ef23",
  "org.scalablytyped" %%% "promise-ftp-common" % "1.1-dt-20180709Z-3e4545",
  "org.scalablytyped" %%% "ssh2" % "v0.5.x-dt-20190322Z-3536cc",
  "org.scalablytyped" %%% "ssh2-streams" % "v0.1.9-dt-20190322Z-1676e6",
  "org.scalablytyped" %%% "std" % "3.5-c5d119")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        