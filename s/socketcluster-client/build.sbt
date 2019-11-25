organization := "org.scalablytyped"
name := "socketcluster-client"
version := "13.0-dt-20190513Z-939612"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "async" % "3.0-dt-20191015Z-65eda5",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20190322Z-2601ad",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-dc567e",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-337b41",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20191015Z-e4b5c5",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191123Z-382692",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-cd8696",
  "org.scalablytyped" %%% "sc-broker-cluster" % "6.1-dt-20190415Z-5affd3",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-2051fa",
  "org.scalablytyped" %%% "sc-errors" % "1.4-dt-20190513Z-bd0861",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20190212Z-64b9e6",
  "org.scalablytyped" %%% "socketcluster-server" % "14.2-dt-20190415Z-3bc40d",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20190823Z-a3e5cc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        