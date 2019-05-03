organization := "org.scalablytyped"
name := "sc-broker"
version := "5.1-dt-20181218Z-7f01c6"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190212Z-f5a815",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20190322Z-365360",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-ef006c",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-2e6cef",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20190304Z-aa4650",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190502Z-84ec9f",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-55c1a0",
  "org.scalablytyped" %%% "sc-broker-cluster" % "6.1-dt-20190415Z-935f40",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-452946",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20190212Z-592490",
  "org.scalablytyped" %%% "socketcluster-server" % "14.2-dt-20190415Z-e05480",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-980bd6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        