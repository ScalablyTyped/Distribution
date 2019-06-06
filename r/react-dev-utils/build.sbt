organization := "org.scalablytyped"
name := "react-dev-utils"
version := "9.0-dt-20190506Z-e3e2f2"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-fb2478",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-cc8509",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20190130Z-c9bb2d",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-a0bc27",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20190326Z-a37a77",
  "org.scalablytyped" %%% "eslint" % "4.16-dt-20190128Z-7fe6ba",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20190322Z-a22775",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190604Z-d1c3bf",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190524Z-712af1",
  "org.scalablytyped" %%% "html-minifier" % "3.5-dt-20190212Z-5acaec",
  "org.scalablytyped" %%% "html-webpack-plugin" % "3.2-dt-20181121Z-c221a6",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20190301Z-7425cc",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20190114Z-4f396f",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20190212Z-e5d13b",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-49fefe",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190605Z-895d8c",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-374f35",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20190322Z-3cc072",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-ed9c04",
  "org.scalablytyped" %%% "source-map" % "0.7.3-04ee27",
  "org.scalablytyped" %%% "std" % "3.5-f010ac",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-ebdc97",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-a1762e",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190521Z-69e6b4",
  "org.scalablytyped" %%% "webpack-dev-server" % "3.1-dt-20190524Z-bac6f9")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        