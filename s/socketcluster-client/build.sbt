organization := "org.scalablytyped"
name := "socketcluster-client"
version := "13.0-dt-20190513Z-36e17e"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "async" % "3.0-dt-20191015Z-25044d",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20190322Z-437d0c",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-ab1a03",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-2a841e",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20191015Z-be9b91",
  "org.scalablytyped" %%% "node" % "12.11-dt-20191023Z-ebe9d8",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-605b45",
  "org.scalablytyped" %%% "sc-broker-cluster" % "6.1-dt-20190415Z-797294",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-ca5e6e",
  "org.scalablytyped" %%% "sc-errors" % "1.4-dt-20190513Z-cddbe0",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20190212Z-e4e2a3",
  "org.scalablytyped" %%% "socketcluster-server" % "14.2-dt-20190415Z-76babb",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20190823Z-8f6b1c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        