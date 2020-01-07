organization := "org.scalablytyped"
name := "sc-hot-reboot"
version := "1.0-dt-20190224Z-6a5a25"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chokidar" % "3.3.1-7724cc",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20191015Z-ffa82f",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200103Z-51871a",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-3e7203",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20191126Z-a05d9c",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        