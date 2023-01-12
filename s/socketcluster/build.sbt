organization := "org.scalablytyped"
name := "socketcluster"
version := "14.0-dt-20211202Z-569cb3"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ag-channel" % "5.0-dt-20220215Z-3303e1",
  "org.scalablytyped" %%% "ag-simple-broker" % "5.0-dt-20220215Z-d00ee7",
  "org.scalablytyped" %%% "async" % "3.2-dt-20220706Z-39a79e",
  "org.scalablytyped" %%% "async-iterable-stream" % "3.0-dt-20211202Z-ef4e17",
  "org.scalablytyped" %%% "async-stream-emitter" % "4.0-dt-20220215Z-3f9051",
  "org.scalablytyped" %%% "consumable-stream" % "2.0-dt-20220215Z-8ba726",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20211202Z-63ca31",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20211202Z-6b8429",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.5-dt-20220824Z-e13f73",
  "org.scalablytyped" %%% "ncom" % "1.0-dt-20211202Z-7a7fc9",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20211202Z-e109c7",
  "org.scalablytyped" %%% "sc-broker" % "8.0-dt-20211202Z-90e0e0",
  "org.scalablytyped" %%% "sc-broker-cluster" % "9.0-dt-20211202Z-0223de",
  "org.scalablytyped" %%% "sc-channel" % "2.0-dt-20211202Z-f601f1",
  "org.scalablytyped" %%% "sc-errors" % "1.4-dt-20211202Z-d3ca97",
  "org.scalablytyped" %%% "socketcluster-server" % "16.1-dt-20220215Z-611cf1",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "stream-demux" % "8.0-dt-20220215Z-eceeb6",
  "org.scalablytyped" %%% "writable-consumable-stream" % "2.0-dt-20220215Z-987f4d",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-507aa7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
