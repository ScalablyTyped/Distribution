organization := "org.scalablytyped"
name := "scc-broker-client"
version := "6.1-dt-20181218Z-185997"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "async" % "3.0-dt-20190722Z-5ab4a0",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20190322Z-a19ac3",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-64f04c",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-6e1e75",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20190304Z-a5ab0c",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190717Z-e46800",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-c30859",
  "org.scalablytyped" %%% "sc-broker" % "5.1-dt-20181218Z-499be0",
  "org.scalablytyped" %%% "sc-broker-cluster" % "6.1-dt-20190415Z-4aa120",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-49bbff",
  "org.scalablytyped" %%% "sc-errors" % "1.4-dt-20190513Z-b9a240",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20190212Z-a2e274",
  "org.scalablytyped" %%% "socketcluster-client" % "13.0-dt-20190513Z-738d4e",
  "org.scalablytyped" %%% "socketcluster-server" % "14.2-dt-20190415Z-f67009",
  "org.scalablytyped" %%% "std" % "3.5-983486",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-98705f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        