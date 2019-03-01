organization := "org.scalablytyped"
name := "sc-broker-cluster"
version := "6.1-dt-20181218Z-ea8c63"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190212Z-e7e673",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20190205Z-92ea0d",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-88ffab",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-f75c97",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20181101Z-a349a5",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-99335f",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-b46f0e",
  "org.scalablytyped" %%% "sc-broker" % "5.1-dt-20181218Z-e5cb5b",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20190212Z-f2d910",
  "org.scalablytyped" %%% "socketcluster-server" % "14.2-dt-20190205Z-0a3157",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-cace4b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        