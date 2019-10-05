organization := "org.scalablytyped"
name := "react-dev-utils"
version := "9.0-dt-20190925Z-ba243c"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-b477a2",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-e27953",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20190130Z-716fc1",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-62c2b3",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20190819Z-b15335",
  "org.scalablytyped" %%% "eslint" % "6.1-dt-20191002Z-540a87",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20190322Z-5a7f09",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190819Z-06675e",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190819Z-8c6b3a",
  "org.scalablytyped" %%% "html-minifier" % "3.5-dt-20190212Z-fb51ca",
  "org.scalablytyped" %%% "html-webpack-plugin" % "3.2-dt-20190712Z-42ba04",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20190301Z-09bab7",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20190819Z-44e449",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20190717Z-9fcec6",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-51ab0c",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191003Z-a35ed6",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-0d10b5",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20190322Z-cefd85",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-f18a47",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20190322Z-0f384b",
  "org.scalablytyped" %%% "source-map" % "0.7.3-293c86",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-6bf1a0",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-5e730c",
  "org.scalablytyped" %%% "webpack" % "4.39-dt-20190928Z-748169",
  "org.scalablytyped" %%% "webpack-dev-server" % "3.1-dt-20190710Z-abab81",
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20180625Z-801efe")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        