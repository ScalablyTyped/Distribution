organization := "org.scalablytyped"
name := "socketcluster-client"
version := "13.0-dt-20190212Z-cc15ea"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190212Z-ca81e9",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20190205Z-21c10f",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-d2abc8",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-a896df",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20181101Z-400a14",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190213Z-0d969a",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-7cccfa",
  "org.scalablytyped" %%% "sc-broker-cluster" % "6.1-dt-20181218Z-eb48bb",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-af7d93",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20190212Z-10a3ad",
  "org.scalablytyped" %%% "socketcluster-server" % "14.2-dt-20190205Z-4264d3",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-f91530")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        