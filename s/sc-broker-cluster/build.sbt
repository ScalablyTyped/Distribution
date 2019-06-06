organization := "org.scalablytyped"
name := "sc-broker-cluster"
version := "6.1-dt-20190415Z-72a6d0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "async" % "3.0-dt-20190604Z-9cf424",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20190322Z-05644f",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-80c599",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-1efbeb",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20190304Z-a8f653",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190605Z-895d8c",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-065f98",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-a09b6a",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20190212Z-8b06b4",
  "org.scalablytyped" %%% "std" % "3.5-f010ac")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        