organization := "org.scalablytyped"
name := "sc-broker"
version := "5.1-dt-20191126Z-bf914e"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "async" % "3.0-dt-20191015Z-65eda5",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20190322Z-2601ad",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-dc567e",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-337b41",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20191015Z-523464",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191126Z-08e889",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-933feb",
  "org.scalablytyped" %%% "sc-broker-cluster" % "6.1-dt-20191126Z-fcd0c8",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-2051fa",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20191126Z-f52cca",
  "org.scalablytyped" %%% "socketcluster-server" % "14.2-dt-20191126Z-f99b0d",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20191125Z-fba3e4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        