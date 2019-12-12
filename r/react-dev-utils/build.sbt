organization := "org.scalablytyped"
name := "react-dev-utils"
version := "9.0-dt-20191126Z-115e51"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-84e0a0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-5c00d3",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20190130Z-4958cd",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-3ec72b",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20190819Z-939227",
  "org.scalablytyped" %%% "eslint" % "6.1-dt-20191126Z-e4d411",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20191119Z-069b07",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-10cbdd",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20191115Z-49513f",
  "org.scalablytyped" %%% "html-minifier" % "3.5-dt-20190212Z-1d74f8",
  "org.scalablytyped" %%% "html-webpack-plugin" % "3.2-dt-20190712Z-dc61a3",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20191115Z-05d5d3",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20190819Z-e3ba49",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20190717Z-78ad87",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-e84c0f",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191126Z-959704",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-1b75dd",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20190322Z-83f9dd",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-1f57e0",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20190322Z-67a687",
  "org.scalablytyped" %%% "source-map" % "0.7.3-651620",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-7c63f1",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-40c681",
  "org.scalablytyped" %%% "webpack" % "4.41-dt-20191116Z-f7ef3e",
  "org.scalablytyped" %%% "webpack-dev-server" % "3.9-dt-20191127Z-7338f5",
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20180625Z-05c57b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        