organization := "org.scalablytyped"
name := "sc-broker"
version := "5.1-dt-20181218Z-6905d3"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190212Z-21c6be",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20190205Z-46bb17",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-0011e0",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-b083e2",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20190304Z-251a27",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190313Z-f6d9fe",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-35fc0e",
  "org.scalablytyped" %%% "sc-broker-cluster" % "6.1-dt-20181218Z-ee3e48",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-afe92d",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20190212Z-7e2444",
  "org.scalablytyped" %%% "socketcluster-server" % "14.2-dt-20190205Z-51ee3a",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-b9f40e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        