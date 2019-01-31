organization := "org.scalablytyped"
name := "socketcluster-client"
version := "13.0-dt-20181130Z-394f9e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190117Z-89bc8b",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20180414Z-0d0eb8",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-436d74",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-35dfbd",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20181101Z-175f9b",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-40209e",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-f60f1a",
  "org.scalablytyped" %%% "sc-broker-cluster" % "6.1-dt-20181218Z-ac6cb8",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-94b410",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20181218Z-f758cd",
  "org.scalablytyped" %%% "socketcluster-server" % "14.2-dt-20190129Z-52b062",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-0360c5")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        