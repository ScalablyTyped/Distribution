organization := "org.scalablytyped"
name := "sc-broker-cluster"
version := "6.1-dt-20181218Z-76afeb"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190212Z-21c6be",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20190322Z-46bb17",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-0011e0",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-b083e2",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20190304Z-3e7071",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190322Z-28a0c1",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-b23802",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-daa6d1",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20190212Z-42cf52",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        