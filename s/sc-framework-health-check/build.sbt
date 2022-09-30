organization := "org.scalablytyped"
name := "sc-framework-health-check"
version := "2.0-dt-20211202Z-b6593a"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ag-channel" % "5.0-dt-20220215Z-a94ce9",
  "org.scalablytyped" %%% "ag-simple-broker" % "5.0-dt-20220215Z-0b3e9e",
  "org.scalablytyped" %%% "async" % "3.2-dt-20220706Z-3797ad",
  "org.scalablytyped" %%% "async-iterable-stream" % "3.0-dt-20211202Z-c871ca",
  "org.scalablytyped" %%% "async-stream-emitter" % "4.0-dt-20220215Z-cf9b27",
  "org.scalablytyped" %%% "consumable-stream" % "2.0-dt-20220215Z-d52362",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20211202Z-6226b2",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-646db4",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-53b851",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20211202Z-ac4e4a",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.5-dt-20220824Z-2d28cd",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-fb8f3f",
  "org.scalablytyped" %%% "ncom" % "1.0-dt-20211202Z-d1065d",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-4e85dc",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20211202Z-14087a",
  "org.scalablytyped" %%% "sc-broker" % "8.0-dt-20211202Z-184f32",
  "org.scalablytyped" %%% "sc-broker-cluster" % "9.0-dt-20211202Z-fe6cf8",
  "org.scalablytyped" %%% "sc-channel" % "2.0-dt-20211202Z-6fd0c5",
  "org.scalablytyped" %%% "sc-errors" % "1.4-dt-20211202Z-611eb2",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-170623",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20211202Z-caf169",
  "org.scalablytyped" %%% "socketcluster-server" % "16.1-dt-20220215Z-7f9169",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "stream-demux" % "8.0-dt-20220215Z-c2f347",
  "org.scalablytyped" %%% "writable-consumable-stream" % "2.0-dt-20220215Z-7a96b8",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-142b86")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
