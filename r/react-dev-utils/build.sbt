organization := "org.scalablytyped"
name := "react-dev-utils"
version := "7.0-dt-20190327Z-e1b997"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-4b6b4d",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-f1929d",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20190130Z-530c1d",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-e08638",
  "org.scalablytyped" %%% "eslint" % "4.16-dt-20190128Z-91813b",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20190322Z-ef0969",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-5204ce",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190423Z-31fe94",
  "org.scalablytyped" %%% "html-minifier" % "3.5-dt-20190212Z-99adcf",
  "org.scalablytyped" %%% "html-webpack-plugin" % "3.2-dt-20181121Z-2ceb17",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20190301Z-0a24d2",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20190114Z-67a76f",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20190212Z-d1c548",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-b7b3da",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190422Z-40afee",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c3b9c7",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20190322Z-8b29e0",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-6713a7",
  "org.scalablytyped" %%% "source-map" % "0.7.3-3d82c0",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-f8c6f2",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-e5143c",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190411Z-a3854f",
  "org.scalablytyped" %%% "webpack-dev-server" % "3.1-dt-20190330Z-fb2349")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        