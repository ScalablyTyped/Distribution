organization := "org.scalablytyped"
name := "socketcluster-client"
version := "13.0-dt-20181205Z-be992c"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.0.1-dt-20181020Z-6d9978",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20180910Z-2b9d71",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181205Z-e7c9e5",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-bd0b69",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20181104Z-2d0f19",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-df5d12",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181205Z-196786",
  "org.scalablytyped" %%% "sc-broker" % "5.1-dt-20181205Z-964d3e",
  "org.scalablytyped" %%% "sc-broker-cluster" % "6.1-dt-20181205Z-c143d2",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181205Z-b7c4af",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20181205Z-3d2f18",
  "org.scalablytyped" %%% "socketcluster-server" % "13.1-dt-20181205Z-796772",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180910Z-ba9141")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        