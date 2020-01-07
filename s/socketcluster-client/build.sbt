organization := "org.scalablytyped"
name := "socketcluster-client"
version := "13.0-dt-20191126Z-ddd19d"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "async" % "3.0-dt-20191015Z-1e057b",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20190322Z-a40bbc",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-05032a",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-c08468",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20191015Z-ffa82f",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200103Z-51871a",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-3e7203",
  "org.scalablytyped" %%% "sc-broker-cluster" % "6.1-dt-20191126Z-142828",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-10f708",
  "org.scalablytyped" %%% "sc-errors" % "1.4-dt-20190513Z-b90121",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20191126Z-a05d9c",
  "org.scalablytyped" %%% "socketcluster-server" % "14.2-dt-20191126Z-7c1fff",
  "org.scalablytyped" %%% "std" % "3.7-b6d959",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20191125Z-c8cf2b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        