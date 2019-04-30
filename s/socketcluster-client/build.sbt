organization := "org.scalablytyped"
name := "socketcluster-client"
version := "13.0-dt-20190212Z-d9f539"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190212Z-5fd0a3",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20190322Z-9937bf",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-df0b75",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-93b0cb",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20190304Z-d6811a",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190429Z-d35e72",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-aa8bac",
  "org.scalablytyped" %%% "sc-broker-cluster" % "6.1-dt-20190415Z-c5fdf3",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-51a40a",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20190212Z-bb2324",
  "org.scalablytyped" %%% "socketcluster-server" % "14.2-dt-20190415Z-daeb36",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-5ba073")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        