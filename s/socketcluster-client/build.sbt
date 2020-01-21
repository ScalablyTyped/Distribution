organization := "org.scalablytyped"
name := "socketcluster-client"
version := "13.0-dt-20191126Z-d3b1b7"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "async" % "3.0-dt-20191015Z-ab0ebe",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20190322Z-17c9e3",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-3b289b",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-7411ce",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20200113Z-c73e01",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200117Z-4be21b",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-afb37e",
  "org.scalablytyped" %%% "sc-broker-cluster" % "6.1-dt-20191126Z-9afe80",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-64ec95",
  "org.scalablytyped" %%% "sc-errors" % "1.4-dt-20190513Z-790e7e",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20191126Z-f4f1bd",
  "org.scalablytyped" %%% "socketcluster-server" % "14.2-dt-20191126Z-1e307a",
  "org.scalablytyped" %%% "std" % "3.7-96076c",
  "org.scalablytyped" %%% "ws" % "7.2-dt-20200115Z-c1344d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        