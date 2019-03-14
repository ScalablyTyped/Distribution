organization := "org.scalablytyped"
name := "sc-framework-health-check"
version := "2.0-dt-20181218Z-b495b5"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190212Z-21c6be",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-c5c4e3",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20190205Z-46bb17",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-fd1784",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-0011e0",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-68b458",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-02a1c5",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-b083e2",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20190304Z-251a27",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-fcf6a3",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190313Z-f6d9fe",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-5082d0",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-35fc0e",
  "org.scalablytyped" %%% "sc-broker" % "5.1-dt-20181218Z-e495c2",
  "org.scalablytyped" %%% "sc-broker-cluster" % "6.1-dt-20181218Z-dbef1b",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-afe92d",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-b44a76",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20190212Z-f5c022",
  "org.scalablytyped" %%% "socketcluster-server" % "14.2-dt-20190205Z-c746ab",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-b9f40e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        