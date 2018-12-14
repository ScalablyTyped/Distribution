organization := "org.scalablytyped"
name := "socketcluster-client"
version := "13.0-dt-20181205Z-9c3efa"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.0.1-dt-20181020Z-6d9978",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20180910Z-2b9d71",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181205Z-e7c9e5",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-bd0b69",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20181104Z-ad5f0b",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-21ad57",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181205Z-8b5d60",
  "org.scalablytyped" %%% "sc-broker" % "5.1-dt-20181205Z-239b06",
  "org.scalablytyped" %%% "sc-broker-cluster" % "6.1-dt-20181205Z-2cc78a",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181205Z-b7c4af",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20181205Z-24d953",
  "org.scalablytyped" %%% "socketcluster-server" % "13.1-dt-20181205Z-956f86",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180910Z-0188a4")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        