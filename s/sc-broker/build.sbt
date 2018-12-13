organization := "org.scalablytyped"
name := "sc-broker"
version := "5.1-dt-20181205Z-879c4b"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181205Z-e7c9e5",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-bd0b69",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20181104Z-21e3c3",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181213Z-bd3349",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20181205Z-300604",
  "org.scalablytyped" %%% "socketcluster" % "14.0-dt-20181205Z-cefb6b",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        