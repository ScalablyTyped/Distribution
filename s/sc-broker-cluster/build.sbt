organization := "org.scalablytyped"
name := "sc-broker-cluster"
version := "6.1-dt-20190415Z-c7ff74"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "async" % "3.0-dt-20191015Z-6511cc",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20190322Z-b1817c",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-922076",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-cdcfb0",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20191015Z-333e4e",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191108Z-6cbaae",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-1a6848",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-158563",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20190212Z-e9d5f0",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        