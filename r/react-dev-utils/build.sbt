organization := "org.scalablytyped"
name := "react-dev-utils"
version := "7.0-dt-20190128Z-93b4a0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-f2620c",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-0020ba",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20190130Z-12d808",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-de294e",
  "org.scalablytyped" %%% "eslint" % "4.16-dt-20190128Z-0eb015",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20180417Z-154c1f",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-921be9",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190318Z-2cedcf",
  "org.scalablytyped" %%% "html-minifier" % "3.5-dt-20190212Z-4c79ac",
  "org.scalablytyped" %%% "html-webpack-plugin" % "3.2-dt-20181121Z-8e0f76",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20190301Z-fc7e6c",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20190114Z-1d5efa",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20190212Z-5dfbbf",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-fcf6a3",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190318Z-f6d9fe",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-5082d0",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20180214Z-eefacf",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-ad4a56",
  "org.scalablytyped" %%% "source-map" % "0.7.3-169991",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180713Z-c57887",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-ffccaa",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190316Z-ea312d",
  "org.scalablytyped" %%% "webpack-dev-server" % "3.1-dt-20190304Z-fbe326")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        