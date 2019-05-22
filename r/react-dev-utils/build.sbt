organization := "org.scalablytyped"
name := "react-dev-utils"
version := "9.0-dt-20190506Z-e5fb26"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-c5c3e6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-9371e4",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20190130Z-31ec11",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-d00fa7",
  "org.scalablytyped" %%% "eslint" % "4.16-dt-20190128Z-dd04e6",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20190322Z-4bb05f",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-b7b8c5",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190429Z-f78ef5",
  "org.scalablytyped" %%% "html-minifier" % "3.5-dt-20190212Z-9f2fd8",
  "org.scalablytyped" %%% "html-webpack-plugin" % "3.2-dt-20181121Z-93f861",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20190301Z-b1ea57",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20190114Z-be23b8",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20190212Z-46d66f",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-169399",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190517Z-07594f",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-acf35f",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20190322Z-0fc3e5",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-58ff5f",
  "org.scalablytyped" %%% "source-map" % "0.7.3-c62343",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-98777a",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-32bf87",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190521Z-b38fdf",
  "org.scalablytyped" %%% "webpack-dev-server" % "3.1-dt-20190330Z-8f75a0")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        