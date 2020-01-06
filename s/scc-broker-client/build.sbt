organization := "org.scalablytyped"
name := "scc-broker-client"
version := "6.1-dt-20191126Z-2760e6"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "async" % "3.0-dt-20191015Z-1e057b",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20190322Z-a40bbc",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-05032a",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-c08468",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20191015Z-802145",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200103Z-b9f880",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-639002",
  "org.scalablytyped" %%% "sc-broker" % "5.1-dt-20191126Z-0e7e77",
  "org.scalablytyped" %%% "sc-broker-cluster" % "6.1-dt-20191126Z-02ab45",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-10f708",
  "org.scalablytyped" %%% "sc-errors" % "1.4-dt-20190513Z-b90121",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20191126Z-ae997b",
  "org.scalablytyped" %%% "socketcluster-client" % "13.0-dt-20191126Z-ed24b6",
  "org.scalablytyped" %%% "socketcluster-server" % "14.2-dt-20191126Z-0ecfeb",
  "org.scalablytyped" %%% "std" % "3.7-b6d959",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20191125Z-380026")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        