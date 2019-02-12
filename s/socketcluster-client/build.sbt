organization := "org.scalablytyped"
name := "socketcluster-client"
version := "13.0-dt-20181130Z-838891"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190117Z-ca81e9",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20180414Z-8e8731",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-d2abc8",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-a896df",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20181101Z-6ae341",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190211Z-6a64f2",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-586c5d",
  "org.scalablytyped" %%% "sc-broker-cluster" % "6.1-dt-20181218Z-bee73f",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-4b8340",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20181218Z-afd9e6",
  "org.scalablytyped" %%% "socketcluster-server" % "14.2-dt-20190129Z-26a779",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-d781e3")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        