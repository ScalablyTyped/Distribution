organization := "org.scalablytyped"
name := "react-dev-utils"
version := "9.0-dt-20190506Z-b61b11"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-a7db04",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-3bd41f",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20190130Z-ff715b",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-bf387c",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20190819Z-edc169",
  "org.scalablytyped" %%% "eslint" % "6.1-dt-20190823Z-73976d",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20190322Z-1c2c91",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190819Z-2bbbb8",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190819Z-0db06c",
  "org.scalablytyped" %%% "html-minifier" % "3.5-dt-20190212Z-35039e",
  "org.scalablytyped" %%% "html-webpack-plugin" % "3.2-dt-20190712Z-9f1c68",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20190301Z-9e8fe8",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20190819Z-8e109f",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20190717Z-58e914",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-612693",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190830Z-a302b7",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-db4fa8",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20190322Z-c9bb1c",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-a273f8",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20190322Z-afc896",
  "org.scalablytyped" %%% "source-map" % "0.7.3-bb5048",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-230399",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-e01dc2",
  "org.scalablytyped" %%% "webpack" % "4.39-dt-20190825Z-4c9c12",
  "org.scalablytyped" %%% "webpack-dev-server" % "3.1-dt-20190710Z-464160",
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20180625Z-deed63")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        