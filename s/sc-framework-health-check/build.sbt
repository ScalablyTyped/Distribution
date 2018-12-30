organization := "org.scalablytyped"
name := "sc-framework-health-check"
version := "2.0-dt-20181218Z-71b5ad"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.0.1-dt-20181121Z-7389a9",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-e65c03",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20180414Z-b0a434",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-38b4a6",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-74ffd8",
  "org.scalablytyped" %%% "express" % "4.16-dt-20180603Z-05cc5e",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180604Z-776b92",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-544dbb",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20181101Z-96f59f",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-b650df",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-e45326",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-ef877c",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-1922e9",
  "org.scalablytyped" %%% "sc-broker" % "5.1-dt-20181218Z-7196b1",
  "org.scalablytyped" %%% "sc-broker-cluster" % "6.1-dt-20181218Z-f458b5",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-ef3744",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-f8f5d7",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20181218Z-d1ee93",
  "org.scalablytyped" %%% "socketcluster-server" % "13.1-dt-20181218Z-bc5ba9",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-790def")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        