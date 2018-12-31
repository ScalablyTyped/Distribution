organization := "org.scalablytyped"
name := "sc-framework-health-check"
version := "2.0-dt-20181218Z-12048a"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.0.1-dt-20181121Z-0b1654",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-ff0790",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20180414Z-7ebc76",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-20e594",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-b8ad0d",
  "org.scalablytyped" %%% "express" % "4.16-dt-20180603Z-b45157",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180604Z-e60b5f",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-2103d7",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20181101Z-be25c7",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-b5dce1",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-77ce7e",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-5932ee",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-f7f5a2",
  "org.scalablytyped" %%% "sc-broker" % "5.1-dt-20181218Z-086e01",
  "org.scalablytyped" %%% "sc-broker-cluster" % "6.1-dt-20181218Z-ed436e",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-fa8f8e",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-d30fee",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20181218Z-b2851d",
  "org.scalablytyped" %%% "socketcluster-server" % "13.1-dt-20181218Z-e68366",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-5fcabc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        