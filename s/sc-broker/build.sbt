organization := "org.scalablytyped"
name := "sc-broker"
version := "5.1-dt-20181218Z-111b97"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.0.1-dt-20181121Z-1551fb",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20180414Z-e69b99",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-874fa3",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-c517c1",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20181101Z-b3a0e4",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2be335",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-4e2e29",
  "org.scalablytyped" %%% "sc-broker-cluster" % "6.1-dt-20181218Z-eaff9b",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-3037c6",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20181218Z-9ba9e6",
  "org.scalablytyped" %%% "socketcluster-server" % "14.2-dt-20190103Z-7718cb",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-641db8")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        