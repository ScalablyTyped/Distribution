organization := "org.scalablytyped"
name := "socketcluster-server"
version := "13.1-dt-20181205Z-1958e4"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.0.1-dt-20181020Z-c71af2",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20180910Z-5eb6a5",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181205Z-bd59cb",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-37251c",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20181104Z-9f716a",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-646a31",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181205Z-7697ef",
  "org.scalablytyped" %%% "sc-broker" % "5.1-dt-20181205Z-b048c3",
  "org.scalablytyped" %%% "sc-broker-cluster" % "6.1-dt-20181205Z-520f46",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181205Z-85f103",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20181205Z-582df6",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180910Z-eebb62")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        