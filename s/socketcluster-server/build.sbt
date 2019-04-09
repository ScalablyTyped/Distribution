organization := "org.scalablytyped"
name := "socketcluster-server"
version := "14.2-dt-20190205Z-00396f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190212Z-7b85eb",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20190322Z-65b038",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-4c1b20",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-b9493c",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20190304Z-067277",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190408Z-6fa8bf",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-f96f4f",
  "org.scalablytyped" %%% "sc-broker-cluster" % "6.1-dt-20181218Z-030037",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-6aeddd",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20190212Z-1f8c63",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-d814f6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        