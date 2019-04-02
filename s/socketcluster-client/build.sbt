organization := "org.scalablytyped"
name := "socketcluster-client"
version := "13.0-dt-20190212Z-efc5e0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190212Z-7b85eb",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20190322Z-65b038",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-4c1b20",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-b9493c",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20190304Z-8c8962",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190330Z-7c1cfd",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-1a5ceb",
  "org.scalablytyped" %%% "sc-broker-cluster" % "6.1-dt-20181218Z-6c6f1f",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-6aeddd",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20190212Z-0a95ba",
  "org.scalablytyped" %%% "socketcluster-server" % "14.2-dt-20190205Z-bd9b37",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-a4282d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        