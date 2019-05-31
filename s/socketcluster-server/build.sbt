organization := "org.scalablytyped"
name := "socketcluster-server"
version := "14.2-dt-20190415Z-279c60"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190508Z-d81a9c",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20190322Z-05644f",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-80c599",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-1efbeb",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20190304Z-062f73",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190530Z-a47442",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-c884c2",
  "org.scalablytyped" %%% "sc-broker-cluster" % "6.1-dt-20190415Z-a4a90b",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-a09b6a",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20190212Z-4272fd",
  "org.scalablytyped" %%% "std" % "3.5-f010ac",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-439372")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        