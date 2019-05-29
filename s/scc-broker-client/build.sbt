organization := "org.scalablytyped"
name := "scc-broker-client"
version := "6.1-dt-20181218Z-715d73"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190508Z-d431c2",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20190322Z-004b91",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-529a44",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-3f0c4d",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20190304Z-4a16cb",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190528Z-17198b",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-1f1b77",
  "org.scalablytyped" %%% "sc-broker" % "5.1-dt-20181218Z-c97ef7",
  "org.scalablytyped" %%% "sc-broker-cluster" % "6.1-dt-20190415Z-31c558",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-30d4c1",
  "org.scalablytyped" %%% "sc-errors" % "1.4-dt-20190513Z-bd5a9d",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20190212Z-affca0",
  "org.scalablytyped" %%% "socketcluster-client" % "13.0-dt-20190513Z-e03c53",
  "org.scalablytyped" %%% "socketcluster-server" % "14.2-dt-20190415Z-f1ceab",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-41362f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        