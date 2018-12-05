organization := "com.scalablytyped"
name := "sc-broker-cluster"
version := "6.1-dt-20181205Z-372a62"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "async" % "2.0.1-dt-20181020Z-4e17a5",
  "com.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20180910Z-cc568a",
  "com.scalablytyped" %%% "expirymanager" % "0.9-dt-20181205Z-52731f",
  "com.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-45e1f4",
  "com.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20181104Z-5545fe",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181203Z-7004b3",
  "com.scalablytyped" %%% "sc-auth" % "5.0-dt-20181205Z-7849ef",
  "com.scalablytyped" %%% "sc-broker" % "5.1-dt-20181205Z-850bec",
  "com.scalablytyped" %%% "sc-channel" % "1.2-dt-20181205Z-345f1b",
  "com.scalablytyped" %%% "socketcluster" % "14.0-dt-20181205Z-98a6cb",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        