organization := "org.scalablytyped"
name := "scc-broker-client"
version := "6.1-dt-20181218Z-ea4caa"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190212Z-5fd0a3",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20190322Z-9937bf",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-df0b75",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-93b0cb",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20190304Z-8acb80",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190409Z-28d4e0",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-6555b1",
  "org.scalablytyped" %%% "sc-broker" % "5.1-dt-20181218Z-c827e7",
  "org.scalablytyped" %%% "sc-broker-cluster" % "6.1-dt-20190415Z-8a227d",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-51a40a",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20190212Z-fbaaf5",
  "org.scalablytyped" %%% "socketcluster-client" % "13.0-dt-20190212Z-9d5f10",
  "org.scalablytyped" %%% "socketcluster-server" % "14.2-dt-20190415Z-266e8d",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-0e4500")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        