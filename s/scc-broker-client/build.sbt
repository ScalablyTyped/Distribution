organization := "org.scalablytyped"
name := "scc-broker-client"
version := "6.1-dt-20181218Z-8016f7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "async" % "3.0-dt-20190604Z-9cf424",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20190322Z-05644f",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-80c599",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-1efbeb",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20190304Z-062f73",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190530Z-a47442",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-c884c2",
  "org.scalablytyped" %%% "sc-broker" % "5.1-dt-20181218Z-c7e985",
  "org.scalablytyped" %%% "sc-broker-cluster" % "6.1-dt-20190415Z-f38928",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-a09b6a",
  "org.scalablytyped" %%% "sc-errors" % "1.4-dt-20190513Z-531792",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20190212Z-4272fd",
  "org.scalablytyped" %%% "socketcluster-client" % "13.0-dt-20190513Z-e436c7",
  "org.scalablytyped" %%% "socketcluster-server" % "14.2-dt-20190415Z-edbbb6",
  "org.scalablytyped" %%% "std" % "3.5-f010ac",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-439372")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        