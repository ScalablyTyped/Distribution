organization := "org.scalablytyped"
name := "socketcluster-client"
version := "13.0-dt-20190212Z-cd591d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190212Z-46bdaa",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20190322Z-d42459",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-44d32a",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-5a118e",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20190304Z-8d4310",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190429Z-40b461",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-e11973",
  "org.scalablytyped" %%% "sc-broker-cluster" % "6.1-dt-20190415Z-bcbcbd",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-be0883",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20190212Z-c6bb10",
  "org.scalablytyped" %%% "socketcluster-server" % "14.2-dt-20190415Z-40a95a",
  "org.scalablytyped" %%% "std" % "3.4-495f93",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-43dfe5")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        