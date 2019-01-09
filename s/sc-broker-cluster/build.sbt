organization := "org.scalablytyped"
name := "sc-broker-cluster"
version := "6.1-dt-20181218Z-0d1a10"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.0.1-dt-20181121Z-64ec94",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20180414Z-04486c",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-2021f6",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-d73b87",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20181101Z-9fb9f9",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2aa425",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-17701f",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-51e3e3",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20181218Z-954498",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        