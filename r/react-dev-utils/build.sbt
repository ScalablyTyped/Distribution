organization := "org.scalablytyped"
name := "react-dev-utils"
version := "9.0-dt-20190925Z-5d1564"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-e7b0ed",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-a86019",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20190130Z-7cb6ac",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-337a2e",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20190819Z-389fd9",
  "org.scalablytyped" %%% "eslint" % "6.1-dt-20191023Z-842fa4",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20190322Z-189c55",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-ce8d0e",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20191115Z-f0de5e",
  "org.scalablytyped" %%% "html-minifier" % "3.5-dt-20190212Z-093478",
  "org.scalablytyped" %%% "html-webpack-plugin" % "3.2-dt-20190712Z-5f7a28",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20191115Z-a8f7f7",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20190819Z-849f10",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20190717Z-a1a6ec",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-301fe0",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191115Z-3b62fb",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-6ebcbf",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20190322Z-516daa",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-ac1781",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20190322Z-402452",
  "org.scalablytyped" %%% "source-map" % "0.7.3-00bd51",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-1ad099",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-391be5",
  "org.scalablytyped" %%% "webpack" % "4.41-dt-20191116Z-828d98",
  "org.scalablytyped" %%% "webpack-dev-server" % "3.4-dt-20191022Z-03f5e9",
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20180625Z-3df8e8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        