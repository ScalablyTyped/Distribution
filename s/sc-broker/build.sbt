organization := "org.scalablytyped"
name := "sc-broker"
version := "5.1-dt-20181218Z-6a1b93"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "async" % "3.0-dt-20190604Z-9b8434",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20190322Z-a19ac3",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-64f04c",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-6e1e75",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20190304Z-60f5bb",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190708Z-e1e986",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-46a259",
  "org.scalablytyped" %%% "sc-broker-cluster" % "6.1-dt-20190415Z-1ab473",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-49bbff",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20190212Z-d13f10",
  "org.scalablytyped" %%% "socketcluster-server" % "14.2-dt-20190415Z-be07b9",
  "org.scalablytyped" %%% "std" % "3.5-983486",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-f208ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        