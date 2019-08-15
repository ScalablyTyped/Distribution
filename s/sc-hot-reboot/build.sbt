organization := "org.scalablytyped"
name := "sc-hot-reboot"
version := "1.0-dt-20190224Z-074f8e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chokidar" % "3.0.2-5abdbf",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20190807Z-101b22",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190815Z-317602",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-577142",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20190212Z-92ae07",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        