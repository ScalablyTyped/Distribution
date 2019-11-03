organization := "org.scalablytyped"
name := "scc-broker-client"
version := "6.1-dt-20181218Z-6e33eb"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "async" % "3.0-dt-20191015Z-25044d",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20190322Z-437d0c",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-ab1a03",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-2a841e",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20191015Z-fc767f",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191101Z-508d7c",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-889775",
  "org.scalablytyped" %%% "sc-broker" % "5.1-dt-20181218Z-627703",
  "org.scalablytyped" %%% "sc-broker-cluster" % "6.1-dt-20190415Z-fa3822",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-ca5e6e",
  "org.scalablytyped" %%% "sc-errors" % "1.4-dt-20190513Z-cddbe0",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20190212Z-164ab4",
  "org.scalablytyped" %%% "socketcluster-client" % "13.0-dt-20190513Z-ce8781",
  "org.scalablytyped" %%% "socketcluster-server" % "14.2-dt-20190415Z-0d36bd",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20190823Z-3f4132")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        