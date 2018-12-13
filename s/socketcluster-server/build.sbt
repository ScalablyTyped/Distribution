organization := "org.scalablytyped"
name := "socketcluster-server"
version := "13.1-dt-20181205Z-f8856d"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.0.1-dt-20181020Z-6d9978",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20180910Z-2b9d71",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181205Z-e7c9e5",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-bd0b69",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20181104Z-21e3c3",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181213Z-bd3349",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181205Z-300604",
  "org.scalablytyped" %%% "sc-broker" % "5.1-dt-20181205Z-879c4b",
  "org.scalablytyped" %%% "sc-broker-cluster" % "6.1-dt-20181205Z-ed042a",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181205Z-b7c4af",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20181205Z-cefb6b",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180910Z-7a5584")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        