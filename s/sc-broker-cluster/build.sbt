organization := "org.scalablytyped"
name := "sc-broker-cluster"
version := "6.1-dt-20190415Z-17621d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "async" % "3.0-dt-20190604Z-6ef29f",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20190322Z-72b246",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-1b7e08",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-3e35f9",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20190304Z-db4a3b",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190703Z-0260d9",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-97a6cc",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-ade52c",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20190212Z-be995c",
  "org.scalablytyped" %%% "std" % "3.5-d4a303")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        