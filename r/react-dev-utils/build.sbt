organization := "org.scalablytyped"
name := "react-dev-utils"
version := "9.0-dt-20200213Z-75dba1"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-d40bf1",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-c42858",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20190130Z-b85509",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20191217Z-058a79",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20190819Z-53e990",
  "org.scalablytyped" %%% "eslint" % "6.1-dt-20200204Z-e27216",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20200108Z-ca21a3",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-641541",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200121Z-e6811a",
  "org.scalablytyped" %%% "html-minifier" % "3.5-dt-20190212Z-f905fe",
  "org.scalablytyped" %%% "html-webpack-plugin" % "3.2-dt-20200129Z-582af6",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20200109Z-efad27",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20190819Z-d992d6",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20191223Z-c70582",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-3b5426",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-b30bde",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-6ae0c0",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20190322Z-1f7c6a",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-28020e",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20190322Z-4dbc49",
  "org.scalablytyped" %%% "source-map" % "0.7.3-020e14",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20200111Z-acd615",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-1b173b",
  "org.scalablytyped" %%% "webpack" % "4.41-dt-20200209Z-2b8189",
  "org.scalablytyped" %%% "webpack-dev-server" % "3.10-dt-20200130Z-f70d7e",
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20200116Z-452939")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
