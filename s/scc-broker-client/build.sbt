organization := "org.scalablytyped"
name := "scc-broker-client"
version := "6.1-dt-20181218Z-c4ef1a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190117Z-ca81e9",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20180414Z-8e8731",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-d2abc8",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-a896df",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20181101Z-43e947",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-7cfc00",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-3d3f50",
  "org.scalablytyped" %%% "sc-broker" % "5.1-dt-20181218Z-2aa044",
  "org.scalablytyped" %%% "sc-broker-cluster" % "6.1-dt-20181218Z-0b6a12",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-3f55bd",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20181218Z-dfe423",
  "org.scalablytyped" %%% "socketcluster-client" % "13.0-dt-20181130Z-426318",
  "org.scalablytyped" %%% "socketcluster-server" % "14.2-dt-20190129Z-ec85cf",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-a4b6f7")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        