organization := "org.scalablytyped"
name := "scc-broker-client"
version := "6.1-dt-20181218Z-df5f14"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190212Z-7b85eb",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20190322Z-65b038",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-4c1b20",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-b9493c",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20190304Z-ece0f7",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190409Z-512fe2",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-4875c1",
  "org.scalablytyped" %%% "sc-broker" % "5.1-dt-20181218Z-8fa963",
  "org.scalablytyped" %%% "sc-broker-cluster" % "6.1-dt-20181218Z-0b0a4d",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-6aeddd",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20190212Z-045df1",
  "org.scalablytyped" %%% "socketcluster-client" % "13.0-dt-20190212Z-87e59a",
  "org.scalablytyped" %%% "socketcluster-server" % "14.2-dt-20190205Z-223430",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-20a177")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        