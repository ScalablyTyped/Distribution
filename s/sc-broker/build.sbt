organization := "org.scalablytyped"
name := "sc-broker"
version := "5.1-dt-20181218Z-7bd2a2"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190212Z-3aa38d",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20190322Z-aff684",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-adcc98",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-6e0a1a",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20190304Z-7d898d",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-6a83c6",
  "org.scalablytyped" %%% "sc-broker-cluster" % "6.1-dt-20181218Z-bd0005",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-151bb8",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20190212Z-c09bb8",
  "org.scalablytyped" %%% "socketcluster-server" % "14.2-dt-20190205Z-c4815a",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-329e67")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        