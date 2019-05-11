organization := "org.scalablytyped"
name := "socketcluster-server"
version := "14.2-dt-20190415Z-8ad664"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190508Z-9205af",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20190322Z-365360",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-ef006c",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-2e6cef",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20190304Z-859b06",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190503Z-cb8223",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-4bdb85",
  "org.scalablytyped" %%% "sc-broker-cluster" % "6.1-dt-20190415Z-1308c2",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-452946",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20190212Z-d97789",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-1ac760")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        