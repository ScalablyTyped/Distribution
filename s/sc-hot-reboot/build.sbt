organization := "org.scalablytyped"
name := "sc-hot-reboot"
version := "1.0-dt-20190224Z-117875"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chokidar" % "3.3.0-d03459",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20191015Z-333e4e",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191108Z-6cbaae",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-1a6848",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20190212Z-e9d5f0",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        