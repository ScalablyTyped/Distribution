organization := "org.scalablytyped"
name := "sc-broker"
version := "5.1-dt-20181205Z-7d109a"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.0.1-dt-20181020Z-6ba948",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20180910Z-39a9cc",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181205Z-ce80de",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-dc3293",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20181104Z-470938",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-702cdc",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181205Z-ffc9d2",
  "org.scalablytyped" %%% "sc-broker-cluster" % "6.1-dt-20181205Z-6de484",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181205Z-47c53d",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20181205Z-a0bdfb",
  "org.scalablytyped" %%% "socketcluster-server" % "13.1-dt-20181205Z-b38f52",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180910Z-bb7698")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        