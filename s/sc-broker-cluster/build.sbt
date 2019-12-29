organization := "org.scalablytyped"
name := "sc-broker-cluster"
version := "6.1-dt-20191126Z-6fee22"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "async" % "3.0-dt-20191015Z-765f3b",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20190322Z-a75a2a",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-8838d5",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-74e3ae",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20191015Z-44a4a0",
  "org.scalablytyped" %%% "node" % "13.1-dt-20191226Z-155d58",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-5d6c74",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-0c2ac8",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20191126Z-742711",
  "org.scalablytyped" %%% "std" % "3.7-953338")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        