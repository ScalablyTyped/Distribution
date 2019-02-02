organization := "org.scalablytyped"
name := "socketcluster-server"
version := "14.2-dt-20190129Z-b14bb2"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190117Z-64883e",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20180414Z-435e06",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-b86d63",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-9869d7",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20181101Z-303d98",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-8da1df",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-bfca42",
  "org.scalablytyped" %%% "sc-broker-cluster" % "6.1-dt-20181218Z-0df2a5",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-711371",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20181218Z-fb441d",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-43e6d0")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        