organization := "org.scalablytyped"
name := "scc-broker-client"
version := "6.1-dt-20181218Z-acddec"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190212Z-85e9e1",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20190205Z-55eacd",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-f1734d",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-28158a",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20190227Z-2ae662",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190302Z-6be09d",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-263f99",
  "org.scalablytyped" %%% "sc-broker" % "5.1-dt-20181218Z-f5f307",
  "org.scalablytyped" %%% "sc-broker-cluster" % "6.1-dt-20181218Z-458e49",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-db4fc1",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20190212Z-830cda",
  "org.scalablytyped" %%% "socketcluster-client" % "13.0-dt-20190212Z-fff8ec",
  "org.scalablytyped" %%% "socketcluster-server" % "14.2-dt-20190205Z-d1084f",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-9b5bdf")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        