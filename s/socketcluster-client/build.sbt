organization := "org.scalablytyped"
name := "socketcluster-client"
version := "13.0-dt-20181130Z-67255b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190117Z-64883e",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20180414Z-435e06",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-b86d63",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-9869d7",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20181101Z-467e4e",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-92720c",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-cb14d3",
  "org.scalablytyped" %%% "sc-broker" % "5.1-dt-20181218Z-7b9346",
  "org.scalablytyped" %%% "sc-broker-cluster" % "6.1-dt-20181218Z-cb485b",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-711371",
  "org.scalablytyped" %%% "socketcluster-server" % "14.2-dt-20190129Z-c5bd73",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-b07b2e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        