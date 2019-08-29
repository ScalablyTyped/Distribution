organization := "org.scalablytyped"
name := "sc-broker-cluster"
version := "6.1-dt-20190415Z-bc334a"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "async" % "3.0-dt-20190722Z-1d1415",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20190322Z-e0884c",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-e8b4ac",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-cd0767",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20190807Z-2e6f4c",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190820Z-c250b3",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-777895",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-303601",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20190212Z-a929d1",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        