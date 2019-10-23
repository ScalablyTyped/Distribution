organization := "org.scalablytyped"
name := "sc-hot-reboot"
version := "1.0-dt-20190224Z-231157"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chokidar" % "3.2.2-1e3f06",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20191015Z-d3691e",
  "org.scalablytyped" %%% "node" % "12.11-dt-20191022Z-f18ffd",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-0e3242",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20190212Z-f5e968",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        