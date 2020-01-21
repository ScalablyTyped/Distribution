organization := "org.scalablytyped"
name := "react-dev-utils"
version := "9.0-dt-20191220Z-61e062"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-68f85b",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-1b4f69",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20190130Z-2e85c0",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20191217Z-b60015",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20190819Z-0af018",
  "org.scalablytyped" %%% "eslint" % "6.1-dt-20191126Z-9a0ef8",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20200108Z-2743ff",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-56f2e3",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20191220Z-8b81e3",
  "org.scalablytyped" %%% "html-minifier" % "3.5-dt-20190212Z-119669",
  "org.scalablytyped" %%% "html-webpack-plugin" % "3.2-dt-20190712Z-828f38",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20200109Z-80a97b",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20190819Z-2db338",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20191223Z-2bdb6c",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-03061a",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200117Z-4be21b",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-b58a9e",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20190322Z-f4d97f",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-314389",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20190322Z-636f72",
  "org.scalablytyped" %%% "source-map" % "0.7.3-27fa0a",
  "org.scalablytyped" %%% "std" % "3.7-96076c",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20200111Z-e40eb2",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-f2b840",
  "org.scalablytyped" %%% "webpack" % "4.41-dt-20200107Z-84e956",
  "org.scalablytyped" %%% "webpack-dev-server" % "3.9-dt-20191127Z-bb06fd",
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20200116Z-e0bcef")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        