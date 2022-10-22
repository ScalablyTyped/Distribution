organization := "org.scalablytyped"
name := "sc-framework-health-check"
version := "2.0-dt-20211202Z-17c9cc"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ag-channel" % "5.0-dt-20220215Z-79181f",
  "org.scalablytyped" %%% "ag-simple-broker" % "5.0-dt-20220215Z-06b5c1",
  "org.scalablytyped" %%% "async" % "3.2-dt-20220706Z-a561f7",
  "org.scalablytyped" %%% "async-iterable-stream" % "3.0-dt-20211202Z-ff943e",
  "org.scalablytyped" %%% "async-stream-emitter" % "4.0-dt-20220215Z-d105bf",
  "org.scalablytyped" %%% "consumable-stream" % "2.0-dt-20220215Z-2f8fc2",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20211202Z-bef5ba",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-eec5d4",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-693358",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20211202Z-e7a898",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.5-dt-20220824Z-e81379",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-9884c6",
  "org.scalablytyped" %%% "ncom" % "1.0-dt-20211202Z-6e84b3",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-76627f",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20211202Z-0237ae",
  "org.scalablytyped" %%% "sc-broker" % "8.0-dt-20211202Z-8a29e9",
  "org.scalablytyped" %%% "sc-broker-cluster" % "9.0-dt-20211202Z-31d67f",
  "org.scalablytyped" %%% "sc-channel" % "2.0-dt-20211202Z-3803cb",
  "org.scalablytyped" %%% "sc-errors" % "1.4-dt-20211202Z-a6b7ed",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-91f487",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20211202Z-cc22f6",
  "org.scalablytyped" %%% "socketcluster-server" % "16.1-dt-20220215Z-62330d",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "stream-demux" % "8.0-dt-20220215Z-86ccce",
  "org.scalablytyped" %%% "writable-consumable-stream" % "2.0-dt-20220215Z-7edd1b",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-a7f58f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
