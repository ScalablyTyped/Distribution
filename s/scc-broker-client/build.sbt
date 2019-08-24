organization := "org.scalablytyped"
name := "scc-broker-client"
version := "6.1-dt-20181218Z-f59bc7"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "async" % "3.0-dt-20190722Z-020c75",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20190322Z-15d2cd",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-060a31",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-d84410",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20190807Z-7c8366",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190820Z-2dc4df",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-fe10e0",
  "org.scalablytyped" %%% "sc-broker" % "5.1-dt-20181218Z-964e4b",
  "org.scalablytyped" %%% "sc-broker-cluster" % "6.1-dt-20190415Z-e43b74",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-a4d584",
  "org.scalablytyped" %%% "sc-errors" % "1.4-dt-20190513Z-aa81e7",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20190212Z-17e28e",
  "org.scalablytyped" %%% "socketcluster-client" % "13.0-dt-20190513Z-587c14",
  "org.scalablytyped" %%% "socketcluster-server" % "14.2-dt-20190415Z-af041c",
  "org.scalablytyped" %%% "std" % "3.5-cd493c",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20190823Z-a1e22f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        