organization := "org.scalablytyped"
name := "rest-io"
version := "5.0.0-6e2b1c"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180910Z-addcd5",
  "org.scalablytyped" %%% "bson" % "1.0.6-dt-20180910Z-e19db4",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180910Z-564d85",
  "org.scalablytyped" %%% "crypto-js" % "v3.1.8-dt-20180910Z-cef7c8",
  "org.scalablytyped" %%% "express" % "4.16-dt-20180910Z-50ee2c",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180910Z-a97c36",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180910Z-1d49f8",
  "org.scalablytyped" %%% "mongodb" % "v3.1-dt-20181203Z-47ec07",
  "org.scalablytyped" %%% "mongoose" % "5.3.4-dt-20181213Z-dc0849",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-702cdc",
  "org.scalablytyped" %%% "pluralize" % "0.0-unknown-dt-20180910Z-6251f3",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181208Z-481dd9",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180910Z-eb00ce",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        