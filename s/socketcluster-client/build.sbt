organization := "org.scalablytyped"
name := "socketcluster-client"
version := "13.0-dt-20190212Z-1ee0a5"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190212Z-5fd0a3",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20190322Z-9937bf",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-df0b75",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-93b0cb",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20190304Z-b9387d",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190419Z-3f0246",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-a1fa4c",
  "org.scalablytyped" %%% "sc-broker-cluster" % "6.1-dt-20190415Z-4cb009",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-51a40a",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20190212Z-95cb99",
  "org.scalablytyped" %%% "socketcluster-server" % "14.2-dt-20190415Z-ef678d",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-1a35e7")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        