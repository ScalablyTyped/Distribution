organization := "org.scalablytyped"
name := "react-dev-utils"
version := "9.0-dt-20191220Z-ece28b"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-5d9733",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-b0b0d9",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20190130Z-2677a7",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20191217Z-f02e41",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20190819Z-7e965c",
  "org.scalablytyped" %%% "eslint" % "6.1-dt-20191126Z-a69022",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20191223Z-0f319a",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-92e6db",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20191220Z-1ddd6d",
  "org.scalablytyped" %%% "html-minifier" % "3.5-dt-20190212Z-4a120b",
  "org.scalablytyped" %%% "html-webpack-plugin" % "3.2-dt-20190712Z-807a7b",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20191115Z-7c0d97",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20190819Z-5d6141",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20191223Z-439809",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-d3b7b2",
  "org.scalablytyped" %%% "node" % "13.1-dt-20191226Z-155d58",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-a681e2",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20190322Z-ff537b",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-a1ed43",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20190322Z-7e3aa1",
  "org.scalablytyped" %%% "source-map" % "0.7.3-e7ea21",
  "org.scalablytyped" %%% "std" % "3.7-953338",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-f0f427",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-3ef08e",
  "org.scalablytyped" %%% "webpack" % "4.41-dt-20191116Z-4580f3",
  "org.scalablytyped" %%% "webpack-dev-server" % "3.9-dt-20191127Z-19cf5d",
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20180625Z-c6dcfb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        