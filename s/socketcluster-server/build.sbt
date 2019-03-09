organization := "org.scalablytyped"
name := "socketcluster-server"
version := "14.2-dt-20190205Z-3e3e6d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190212Z-85e9e1",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20190205Z-55eacd",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-f1734d",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-28158a",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20190304Z-5e6dc6",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190307Z-7720a8",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-e499dd",
  "org.scalablytyped" %%% "sc-broker" % "5.1-dt-20181218Z-c32d21",
  "org.scalablytyped" %%% "sc-broker-cluster" % "6.1-dt-20181218Z-f1d9ac",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-db4fc1",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-258a45")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        