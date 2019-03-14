organization := "org.scalablytyped"
name := "sc-hot-reboot"
version := "1.0-dt-20190224Z-1b2d5c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-f2620c",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190212Z-21c6be",
  "org.scalablytyped" %%% "braces" % "2.3-dt-20180214Z-edb918",
  "org.scalablytyped" %%% "chokidar" % "2.1.2-767f5a",
  "org.scalablytyped" %%% "component-emitter" % "v1.2.1-dt-20190205Z-46bb17",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-0011e0",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-b083e2",
  "org.scalablytyped" %%% "glob-parent" % "3.1-dt-20180214Z-ec6929",
  "org.scalablytyped" %%% "inherits" % "0.0-unknown-dt-20180214Z-d8c604",
  "org.scalablytyped" %%% "is-binary-path" % "2.0-dt-20180214Z-3fe20d",
  "org.scalablytyped" %%% "is-glob" % "4.0-dt-20180214Z-399c7b",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20190304Z-251a27",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190313Z-f6d9fe",
  "org.scalablytyped" %%% "normalize-path" % "3.0-dt-20181225Z-d47c85",
  "org.scalablytyped" %%% "path-is-absolute" % "1.0-dt-20180214Z-5c48c7",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181130Z-35fc0e",
  "org.scalablytyped" %%% "sc-broker" % "5.1-dt-20181218Z-e495c2",
  "org.scalablytyped" %%% "sc-broker-cluster" % "6.1-dt-20181218Z-dbef1b",
  "org.scalablytyped" %%% "sc-channel" % "1.2-dt-20181130Z-afe92d",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20190212Z-f5c022",
  "org.scalablytyped" %%% "socketcluster-server" % "14.2-dt-20190205Z-c746ab",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "upath" % "1.1.2-339e4c",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-b9f40e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        