organization := "org.scalablytyped"
name := "react-dev-utils"
version := "9.0-dt-20190506Z-9c8f46"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-44bb30",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-0f462b",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20190130Z-940382",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-8e708a",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20190819Z-850f50",
  "org.scalablytyped" %%% "eslint" % "4.16-dt-20190809Z-4c6f91",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20190322Z-1859c4",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190819Z-381ce5",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190819Z-aba9aa",
  "org.scalablytyped" %%% "html-minifier" % "3.5-dt-20190212Z-54da5f",
  "org.scalablytyped" %%% "html-webpack-plugin" % "3.2-dt-20190712Z-73ae95",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20190301Z-21c3c6",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20190819Z-0c5371",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20190717Z-565518",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-c877f7",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190815Z-2dc4df",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-b87c0a",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20190322Z-8feecc",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-c4d375",
  "org.scalablytyped" %%% "source-map" % "0.7.3-20fa05",
  "org.scalablytyped" %%% "std" % "3.5-cd493c",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-8d90ab",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-a7321d",
  "org.scalablytyped" %%% "webpack" % "4.32-dt-20190817Z-06263e",
  "org.scalablytyped" %%% "webpack-dev-server" % "3.1-dt-20190710Z-db6eb7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        