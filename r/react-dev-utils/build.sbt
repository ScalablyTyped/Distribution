organization := "org.scalablytyped"
name := "react-dev-utils"
version := "9.0-dt-20190925Z-463f2a"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-a7db04",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-4a01ec",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20190130Z-73e1b4",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-4ebaba",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20190819Z-510bf0",
  "org.scalablytyped" %%% "eslint" % "6.1-dt-20191002Z-9d40eb",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20190322Z-1c2c91",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190819Z-c5a083",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190819Z-7372e6",
  "org.scalablytyped" %%% "html-minifier" % "3.5-dt-20190212Z-5b5a96",
  "org.scalablytyped" %%% "html-webpack-plugin" % "3.2-dt-20190712Z-c0dc5d",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20190301Z-f37d56",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20190819Z-b14fef",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20190717Z-58e914",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-612693",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191003Z-e91184",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-db4fa8",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20190322Z-c9bb1c",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-c08138",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20190322Z-afc896",
  "org.scalablytyped" %%% "source-map" % "0.7.3-bb5048",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-230399",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-e01dc2",
  "org.scalablytyped" %%% "webpack" % "4.39-dt-20190928Z-63e7f1",
  "org.scalablytyped" %%% "webpack-dev-server" % "3.1-dt-20190710Z-f3965e",
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20180625Z-81002d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        