organization := "org.scalablytyped"
name := "scc-broker-client"
version := "6.1-dt-20181218Z-6e7800"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "async" % "3.0-dt-20190925Z-14ac30",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20190322Z-437d0c",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-ab1a03",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-2a841e",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20190918Z-5818b8",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191008Z-c62b25",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-eb408f",
  "org.scalablytyped" %%% "sc-broker" % "5.1-dt-20181218Z-fd7f7b",
  "org.scalablytyped" %%% "sc-broker-cluster" % "6.1-dt-20190415Z-ed8822",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-ca5e6e",
  "org.scalablytyped" %%% "sc-errors" % "1.4-dt-20190513Z-cddbe0",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20190212Z-56de44",
  "org.scalablytyped" %%% "socketcluster-client" % "13.0-dt-20190513Z-63f754",
  "org.scalablytyped" %%% "socketcluster-server" % "14.2-dt-20190415Z-337823",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20190823Z-9bab89")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        