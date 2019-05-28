organization := "org.scalablytyped"
name := "scc-broker-client"
version := "6.1-dt-20181218Z-e5a8e4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190508Z-9205af",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20190322Z-365360",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-ef006c",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-2e6cef",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20190304Z-6ba005",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190517Z-1fb914",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-3ca32d",
  "org.scalablytyped" %%% "sc-broker" % "5.1-dt-20181218Z-cdf072",
  "org.scalablytyped" %%% "sc-broker-cluster" % "6.1-dt-20190415Z-f0efde",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-452946",
  "org.scalablytyped" %%% "sc-errors" % "1.4-dt-20190513Z-53d5c8",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20190212Z-ae65c6",
  "org.scalablytyped" %%% "socketcluster-client" % "13.0-dt-20190513Z-b32716",
  "org.scalablytyped" %%% "socketcluster-server" % "14.2-dt-20190415Z-5a88bf",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-fb977b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        