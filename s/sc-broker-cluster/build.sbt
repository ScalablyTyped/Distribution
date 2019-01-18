organization := "org.scalablytyped"
name := "sc-broker-cluster"
version := "6.1-dt-20181218Z-ffbc6c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190117Z-89bc8b",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20180414Z-0d0eb8",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-436d74",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-35dfbd",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20181101Z-308c3d",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-7438ae",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-ea3ed3",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-94b410",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20181218Z-e2ef99",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        