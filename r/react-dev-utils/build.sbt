organization := "org.scalablytyped"
name := "react-dev-utils"
version := "9.0-dt-20190506Z-fe11f2"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-facedf",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-e8e964",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20190130Z-c6f0d6",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-4a549d",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20190326Z-d51a84",
  "org.scalablytyped" %%% "eslint" % "4.16-dt-20190809Z-1dd298",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20190322Z-35ffb4",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190604Z-057966",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190717Z-b72682",
  "org.scalablytyped" %%% "html-minifier" % "3.5-dt-20190212Z-49b330",
  "org.scalablytyped" %%% "html-webpack-plugin" % "3.2-dt-20190712Z-20baea",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20190301Z-19609a",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20190114Z-e484ab",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20190717Z-ae8088",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-85a68c",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190807Z-ed4b3f",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-223eff",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20190322Z-fa55c4",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-c244ba",
  "org.scalablytyped" %%% "source-map" % "0.7.3-9427ea",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-86c6de",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-594357",
  "org.scalablytyped" %%% "webpack" % "4.32-dt-20190724Z-6e749c",
  "org.scalablytyped" %%% "webpack-dev-server" % "3.1-dt-20190710Z-59ff99")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        