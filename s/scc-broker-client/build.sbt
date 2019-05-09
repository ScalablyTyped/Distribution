organization := "org.scalablytyped"
name := "scc-broker-client"
version := "6.1-dt-20181218Z-0ccfb2"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190508Z-9205af",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20190322Z-365360",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-ef006c",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-2e6cef",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20190304Z-6eab17",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190503Z-6753fb",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-75da0d",
  "org.scalablytyped" %%% "sc-broker" % "5.1-dt-20181218Z-3d5ea1",
  "org.scalablytyped" %%% "sc-broker-cluster" % "6.1-dt-20190415Z-f123b5",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-452946",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20190212Z-75d37d",
  "org.scalablytyped" %%% "socketcluster-client" % "13.0-dt-20190212Z-5b1eaa",
  "org.scalablytyped" %%% "socketcluster-server" % "14.2-dt-20190415Z-215197",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-84d95d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        