organization := "org.scalablytyped"
name := "sc-broker-cluster"
version := "6.1-dt-20190415Z-325ee9"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "async" % "3.0-dt-20190722Z-ecfa24",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20190322Z-30c89b",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-8a7b5d",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-e4dffb",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20190304Z-d27277",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190731Z-f93e3e",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-334dc8",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-187eec",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20190212Z-f97f1e",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        