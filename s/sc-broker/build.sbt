organization := "org.scalablytyped"
name := "sc-broker"
version := "5.1-dt-20181218Z-b1095e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190212Z-21c6be",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20190205Z-46bb17",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-0011e0",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-b083e2",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20190304Z-3cbe3a",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190320Z-26b6b7",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-eda4f2",
  "org.scalablytyped" %%% "sc-broker-cluster" % "6.1-dt-20181218Z-43ec3f",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-afe92d",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20190212Z-f91502",
  "org.scalablytyped" %%% "socketcluster-server" % "14.2-dt-20190205Z-9c31c4",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-8629d7")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        