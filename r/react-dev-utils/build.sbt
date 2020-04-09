organization := "org.scalablytyped"
name := "react-dev-utils"
version := "9.0-dt-20200213Z-d9aa19"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-d40bf1",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-777753",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20200226Z-113153",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20200226Z-26d1e9",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20190819Z-cbfb8c",
  "org.scalablytyped" %%% "eslint" % "6.8-dt-20200406Z-eb832d",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20200320Z-692182",
  "org.scalablytyped" %%% "express" % "4.17-dt-20200331Z-79bd5c",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200323Z-88b703",
  "org.scalablytyped" %%% "html-minifier" % "3.5-dt-20200226Z-c9396c",
  "org.scalablytyped" %%% "html-webpack-plugin" % "3.2-dt-20200129Z-2a8c9f",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20200320Z-0ff3ce",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20190819Z-08a644",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20200225Z-0f312e",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-3b5426",
  "org.scalablytyped" %%% "node" % "13.11-dt-20200402Z-9a87f0",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20200225Z-e66ac9",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-6ae0c0",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20200227Z-1f7c6a",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20200227Z-e748ee",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20200225Z-4dbc49",
  "org.scalablytyped" %%% "source-map" % "0.7.3-020e14",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20200225Z-acd615",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20200331Z-e61abf",
  "org.scalablytyped" %%% "webpack" % "4.41-dt-20200331Z-f1543a",
  "org.scalablytyped" %%% "webpack-dev-server" % "3.10-dt-20200312Z-8644e4",
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20200323Z-7d5534")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
