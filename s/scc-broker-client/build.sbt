organization := "org.scalablytyped"
name := "scc-broker-client"
version := "6.1-dt-20181218Z-b68290"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "async" % "3.0-dt-20190722Z-1d1415",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20190322Z-e0884c",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-e8b4ac",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-cd0767",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20190807Z-35c54c",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190830Z-a302b7",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-758b64",
  "org.scalablytyped" %%% "sc-broker" % "5.1-dt-20181218Z-319d12",
  "org.scalablytyped" %%% "sc-broker-cluster" % "6.1-dt-20190415Z-f7775e",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-303601",
  "org.scalablytyped" %%% "sc-errors" % "1.4-dt-20190513Z-03fc4f",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20190212Z-85ecba",
  "org.scalablytyped" %%% "socketcluster-client" % "13.0-dt-20190513Z-961be3",
  "org.scalablytyped" %%% "socketcluster-server" % "14.2-dt-20190415Z-0d020b",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20190823Z-4e4590")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        