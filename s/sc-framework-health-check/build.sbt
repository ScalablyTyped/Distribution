organization := "org.scalablytyped"
name := "sc-framework-health-check"
version := "2.0-dt-20200205Z-4e1acf"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "async" % "3.2-dt-20200515Z-e58bea",
  "org.scalablytyped" %%% "async-iterable-stream" % "3.0-dt-20200205Z-ac7178",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-3a735c",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20200515Z-3cac79",
  "org.scalablytyped" %%% "consumable-stream" % "1.0-dt-20200205Z-a09b84",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-9d5717",
  "org.scalablytyped" %%% "express" % "4.17-dt-20200706Z-53ce1b",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200722Z-ebd859",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-23e0ed",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.5-dt-20200513Z-0e59be",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20200722Z-298525",
  "org.scalablytyped" %%% "ncom" % "1.0-dt-20200205Z-fce4c6",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200724Z-6c1ba3",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20200519Z-556671",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-3a906b",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20200407Z-fb42dd",
  "org.scalablytyped" %%% "sc-broker" % "8.0-dt-20200519Z-29338f",
  "org.scalablytyped" %%% "sc-broker-cluster" % "9.0-dt-20200205Z-b735e2",
  "org.scalablytyped" %%% "sc-channel" % "2.0-dt-20200205Z-951403",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20200519Z-4f6d32",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20200205Z-e3cbae",
  "org.scalablytyped" %%% "std" % "3.9-bafc13",
  "org.scalablytyped" %%% "stream-demux" % "7.0-dt-20200205Z-056466",
  "org.scalablytyped" %%% "writable-consumable-stream" % "1.1-dt-20200205Z-7ca15a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
