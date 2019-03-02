organization := "org.scalablytyped"
name := "sc-broker-cluster"
version := "6.1-dt-20181218Z-b46561"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190212Z-e7e673",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20190205Z-92ea0d",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-88ffab",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-f75c97",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20181101Z-164c7d",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-bb7734",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-2f8e4a",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-c096f7",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20190212Z-28441a",
  "org.scalablytyped" %%% "std" % "3.3-6e4388")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        