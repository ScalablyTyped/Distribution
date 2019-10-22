organization := "org.scalablytyped"
name := "scc-broker-client"
version := "6.1-dt-20181218Z-4c42c6"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "async" % "3.0-dt-20191015Z-25044d",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20190322Z-437d0c",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-ab1a03",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-2a841e",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20191015Z-fa20b8",
  "org.scalablytyped" %%% "node" % "12.11-dt-20191021Z-a8dc6e",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-4ea00e",
  "org.scalablytyped" %%% "sc-broker" % "5.1-dt-20181218Z-9d8e4f",
  "org.scalablytyped" %%% "sc-broker-cluster" % "6.1-dt-20190415Z-9d411c",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-ca5e6e",
  "org.scalablytyped" %%% "sc-errors" % "1.4-dt-20190513Z-cddbe0",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20190212Z-6406a0",
  "org.scalablytyped" %%% "socketcluster-client" % "13.0-dt-20190513Z-f2b772",
  "org.scalablytyped" %%% "socketcluster-server" % "14.2-dt-20190415Z-b811d2",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20190823Z-05db9b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        