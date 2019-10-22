organization := "org.scalablytyped"
name := "react-dev-utils"
version := "9.0-dt-20190925Z-43919d"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-7f5e7d",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-9a4c55",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20190130Z-22d16d",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-0179d8",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20190819Z-4e74b4",
  "org.scalablytyped" %%% "eslint" % "6.1-dt-20191002Z-33ba94",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20190322Z-3c0f0e",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190819Z-7c2aeb",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20191015Z-a10e25",
  "org.scalablytyped" %%% "html-minifier" % "3.5-dt-20190212Z-282045",
  "org.scalablytyped" %%% "html-webpack-plugin" % "3.2-dt-20190712Z-710045",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20190301Z-395797",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20190819Z-705d60",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20190717Z-94fac0",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-8e1e66",
  "org.scalablytyped" %%% "node" % "12.11-dt-20191021Z-a8dc6e",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c44ea2",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20190322Z-707462",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-3a858a",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20190322Z-df1e9f",
  "org.scalablytyped" %%% "source-map" % "0.7.3-54a40f",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-463316",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-2f0bcb",
  "org.scalablytyped" %%% "webpack" % "4.39-dt-20191021Z-b14dd4",
  "org.scalablytyped" %%% "webpack-dev-server" % "3.1-dt-20190710Z-3bac17",
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20180625Z-d0a6ac")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        