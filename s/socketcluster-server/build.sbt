organization := "org.scalablytyped"
name := "socketcluster-server"
version := "13.1-dt-20181205Z-24c1ca"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.0.1-dt-20181020Z-42f75e",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20180910Z-1e03f8",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181205Z-365542",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-969394",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20181104Z-1302f9",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-d9c01e",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181205Z-faf5cd",
  "org.scalablytyped" %%% "sc-broker" % "5.1-dt-20181205Z-7e20ba",
  "org.scalablytyped" %%% "sc-broker-cluster" % "6.1-dt-20181205Z-b3e294",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181205Z-bfdec8",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20181205Z-603bd9",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180910Z-85e500")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        