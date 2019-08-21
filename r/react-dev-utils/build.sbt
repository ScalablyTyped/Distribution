organization := "org.scalablytyped"
name := "react-dev-utils"
version := "9.0-dt-20190506Z-567635"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-44bb30",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-234f40",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20190130Z-418c06",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-8f9eda",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20190819Z-40643f",
  "org.scalablytyped" %%% "eslint" % "6.1-dt-20190820Z-4c6f91",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20190322Z-1859c4",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190819Z-79dfe3",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190819Z-3d1b1f",
  "org.scalablytyped" %%% "html-minifier" % "3.5-dt-20190212Z-2eb757",
  "org.scalablytyped" %%% "html-webpack-plugin" % "3.2-dt-20190712Z-311232",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20190301Z-3ff014",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20190819Z-131225",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20190717Z-565518",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-c877f7",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190820Z-2dc4df",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-b87c0a",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20190322Z-8feecc",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-6da2a4",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20190322Z-2a8016",
  "org.scalablytyped" %%% "source-map" % "0.7.3-20fa05",
  "org.scalablytyped" %%% "std" % "3.5-cd493c",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-8d90ab",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-a7321d",
  "org.scalablytyped" %%% "webpack" % "4.39-dt-20190819Z-ce1355",
  "org.scalablytyped" %%% "webpack-dev-server" % "3.1-dt-20190710Z-7e423a",
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20180625Z-a8f7f9")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        