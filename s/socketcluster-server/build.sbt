organization := "org.scalablytyped"
name := "socketcluster-server"
version := "14.2-dt-20190205Z-768413"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190212Z-85e9e1",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20190205Z-55eacd",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-f1734d",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-28158a",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20181101Z-1152fa",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-fd0a52",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-6ebab0",
  "org.scalablytyped" %%% "sc-broker-cluster" % "6.1-dt-20181218Z-cdb3f0",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-db4fc1",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20190212Z-b9f6c3",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-d82b7c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        