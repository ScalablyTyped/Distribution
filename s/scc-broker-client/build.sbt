organization := "org.scalablytyped"
name := "scc-broker-client"
version := "6.1-dt-20181218Z-45a99c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190212Z-21c6be",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20190205Z-46bb17",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-0011e0",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-b083e2",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20190304Z-89b494",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190311Z-8b4969",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-a2a62b",
  "org.scalablytyped" %%% "sc-broker" % "5.1-dt-20181218Z-17bab8",
  "org.scalablytyped" %%% "sc-broker-cluster" % "6.1-dt-20181218Z-d3fd51",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-afe92d",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20190212Z-1c204f",
  "org.scalablytyped" %%% "socketcluster-client" % "13.0-dt-20190212Z-5dd4bd",
  "org.scalablytyped" %%% "socketcluster-server" % "14.2-dt-20190205Z-b4d240",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-3b75b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        