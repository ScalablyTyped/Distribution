organization := "org.scalablytyped"
name := "socketcluster-client"
version := "13.0-dt-20190513Z-ce38fe"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "async" % "3.0-dt-20190925Z-91e680",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20190322Z-e0884c",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-e8b4ac",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-cd0767",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20190918Z-e1028d",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191003Z-e91184",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-944f02",
  "org.scalablytyped" %%% "sc-broker-cluster" % "6.1-dt-20190415Z-dc18ef",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-303601",
  "org.scalablytyped" %%% "sc-errors" % "1.4-dt-20190513Z-03fc4f",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20190212Z-9b54d0",
  "org.scalablytyped" %%% "socketcluster-server" % "14.2-dt-20190415Z-8477f8",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20190823Z-46b3ba")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        