organization := "org.scalablytyped"
name := "sc-broker"
version := "5.1-dt-20181218Z-a5cf34"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.0.1-dt-20181121Z-0b1654",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20180414Z-7ebc76",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-b8ad0d",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-2103d7",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20181101Z-be25c7",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-77ce7e",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-f7f5a2",
  "org.scalablytyped" %%% "sc-broker-cluster" % "6.1-dt-20181218Z-e5074d",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-fa8f8e",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20181218Z-68f07b",
  "org.scalablytyped" %%% "socketcluster-server" % "14.2-dt-20190103Z-fcfbd9",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-5fcabc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        