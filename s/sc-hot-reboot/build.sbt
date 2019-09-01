organization := "org.scalablytyped"
name := "sc-hot-reboot"
version := "1.0-dt-20190224Z-82a80a"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chokidar" % "3.0.2-aa7ce6",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20190807Z-35c54c",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190830Z-a302b7",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-758b64",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20190212Z-85ecba",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        