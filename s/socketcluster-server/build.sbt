organization := "org.scalablytyped"
name := "socketcluster-server"
version := "14.2-dt-20190415Z-b276d4"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "async" % "3.0-dt-20191015Z-25044d",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20190322Z-437d0c",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-ab1a03",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-2a841e",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20191015Z-d3691e",
  "org.scalablytyped" %%% "node" % "12.11-dt-20191022Z-f18ffd",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-0e3242",
  "org.scalablytyped" %%% "sc-broker-cluster" % "6.1-dt-20190415Z-8cc3ea",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-ca5e6e",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20190212Z-f5e968",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20190823Z-1d5525")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        