organization := "org.scalablytyped"
name := "react-dev-utils"
version := "7.0-dt-20190128Z-5c85f9"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20180214Z-a09216",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-cbd349",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20190130Z-acb305",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-fc559d",
  "org.scalablytyped" %%% "eslint" % "4.16-dt-20190128Z-0126f0",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20180417Z-2db6a8",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-593054",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-12a485",
  "org.scalablytyped" %%% "html-minifier" % "3.5-dt-20190124Z-de0a81",
  "org.scalablytyped" %%% "html-webpack-plugin" % "3.2-dt-20181121Z-260ccf",
  "org.scalablytyped" %%% "http-proxy" % "1.16-dt-20180514Z-5ce93e",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20190114Z-e535ef",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20190201Z-5b2cd9",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-54d3f4",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190206Z-9f73ab",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c7c39d",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20180214Z-07f5e7",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-ed7327",
  "org.scalablytyped" %%% "source-map" % "0.7.3-cdf339",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180713Z-2fd0f1",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-876284",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190116Z-b442e4",
  "org.scalablytyped" %%% "webpack-dev-server" % "3.1-dt-20190129Z-866fbe")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        