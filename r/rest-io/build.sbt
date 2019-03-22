organization := "org.scalablytyped"
name := "rest-io"
version := "5.0.0-b5b965"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-c1f3cd",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20190211Z-f3c48c",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-364e03",
  "org.scalablytyped" %%% "crypto-js" % "v3.1.8-dt-20180725Z-99dfc9",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-4f0018",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190318Z-df1ad4",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-fcf6a3",
  "org.scalablytyped" %%% "mongodb" % "3.1-dt-20190307Z-403da2",
  "org.scalablytyped" %%% "mongoose" % "5.3.4-dt-20190318Z-a17034",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190320Z-26b6b7",
  "org.scalablytyped" %%% "pluralize" % "0.0-unknown-dt-20180712Z-d76a6f",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-5082d0",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-c2acbe",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        