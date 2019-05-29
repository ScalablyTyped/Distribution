organization := "org.scalablytyped"
name := "sc-broker-cluster"
version := "6.1-dt-20190415Z-31c558"
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
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-30d4c1",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20190212Z-affca0",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        