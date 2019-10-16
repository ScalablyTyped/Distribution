organization := "org.scalablytyped"
name := "sc-hot-reboot"
version := "1.0-dt-20190224Z-51012d"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chokidar" % "3.2.2-8ff100",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20191015Z-56d3d5",
  "org.scalablytyped" %%% "node" % "12.11-dt-20191015Z-4f243e",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-7b70b3",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20190212Z-c280d4",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        