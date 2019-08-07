organization := "org.scalablytyped"
name := "promise-sftp"
version := "1.3-dt-20190717Z-4aa547"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190524Z-2c5248",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190806Z-18826b",
  "org.scalablytyped" %%% "promise-ftp-common" % "1.1-dt-20180709Z-2def75",
  "org.scalablytyped" %%% "ssh2" % "v0.5.x-dt-20190322Z-0c2685",
  "org.scalablytyped" %%% "ssh2-streams" % "v0.1.9-dt-20190322Z-3ce104",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        