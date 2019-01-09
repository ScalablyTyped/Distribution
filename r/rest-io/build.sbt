organization := "org.scalablytyped"
name := "rest-io"
version := "5.0.0-06da86"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-07367a",
  "org.scalablytyped" %%% "bson" % "1.0.6-dt-20180721Z-87cf06",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-2e760b",
  "org.scalablytyped" %%% "crypto-js" % "v3.1.8-dt-20180725Z-902a43",
  "org.scalablytyped" %%% "express" % "4.16-dt-20180603Z-b9978d",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180604Z-afbe4d",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-b17d95",
  "org.scalablytyped" %%% "mongodb" % "v3.1-dt-20181223Z-0d9d77",
  "org.scalablytyped" %%% "mongoose" % "5.3.4-dt-20190103Z-cd5800",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2aa425",
  "org.scalablytyped" %%% "pluralize" % "0.0-unknown-dt-20180712Z-5e5d54",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-13d69c",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-3abc85",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        