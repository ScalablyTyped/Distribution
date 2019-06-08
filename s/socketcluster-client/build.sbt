organization := "org.scalablytyped"
name := "socketcluster-client"
version := "13.0-dt-20190513Z-fdb2ec"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "async" % "3.0-dt-20190604Z-9cf424",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20190322Z-05644f",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-80c599",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-1efbeb",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20190304Z-bf21f2",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190606Z-b7fe68",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-254a34",
  "org.scalablytyped" %%% "sc-broker-cluster" % "6.1-dt-20190415Z-e8f7f8",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-a09b6a",
  "org.scalablytyped" %%% "sc-errors" % "1.4-dt-20190513Z-531792",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20190212Z-9312a5",
  "org.scalablytyped" %%% "socketcluster-server" % "14.2-dt-20190415Z-888153",
  "org.scalablytyped" %%% "std" % "3.5-f010ac",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-855b6c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        