organization := "org.scalablytyped"
name := "react-dev-utils"
version := "9.0-dt-20190506Z-dfe1ff"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-c5c3e6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-bec058",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20190130Z-97bdb1",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-26b345",
  "org.scalablytyped" %%% "eslint" % "4.16-dt-20190128Z-4214b2",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20190322Z-4bb05f",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-3cd88f",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190429Z-f7bfa3",
  "org.scalablytyped" %%% "html-minifier" % "3.5-dt-20190212Z-0db007",
  "org.scalablytyped" %%% "html-webpack-plugin" % "3.2-dt-20181121Z-518685",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20190301Z-d997dd",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20190114Z-aa69ba",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20190212Z-46d66f",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-169399",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190503Z-cb8223",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-acf35f",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20190322Z-0fc3e5",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-ad1ffd",
  "org.scalablytyped" %%% "source-map" % "0.7.3-c62343",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-98777a",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-32bf87",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190506Z-0b4eec",
  "org.scalablytyped" %%% "webpack-dev-server" % "3.1-dt-20190330Z-86ad06")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        