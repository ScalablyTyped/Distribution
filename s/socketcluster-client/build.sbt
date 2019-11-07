organization := "org.scalablytyped"
name := "socketcluster-client"
version := "13.0-dt-20190513Z-488ee8"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "async" % "3.0-dt-20191015Z-6511cc",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20190322Z-b1817c",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-922076",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-cdcfb0",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20191015Z-9063ad",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191105Z-2397f3",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-5bef67",
  "org.scalablytyped" %%% "sc-broker-cluster" % "6.1-dt-20190415Z-9cfdc1",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-158563",
  "org.scalablytyped" %%% "sc-errors" % "1.4-dt-20190513Z-72861d",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20190212Z-64f48e",
  "org.scalablytyped" %%% "socketcluster-server" % "14.2-dt-20190415Z-2def87",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20190823Z-622711")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        