organization := "org.scalablytyped"
name := "sc-broker"
version := "5.1-dt-20181218Z-17dd5d"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "async" % "3.0-dt-20190925Z-1577b0",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20190322Z-27a633",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-ff5c6e",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-71b94f",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20190918Z-8492ba",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191003Z-a35ed6",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-1e774b",
  "org.scalablytyped" %%% "sc-broker-cluster" % "6.1-dt-20190415Z-aeb4d8",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-0e06c5",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20190212Z-860bc0",
  "org.scalablytyped" %%% "socketcluster-server" % "14.2-dt-20190415Z-18935b",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20190823Z-7c8f95")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        