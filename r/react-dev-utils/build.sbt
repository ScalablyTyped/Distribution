organization := "org.scalablytyped"
name := "react-dev-utils"
version := "9.0-dt-20190506Z-17c5b6"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-375ab8",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-f89d38",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20190130Z-0a76b7",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-07b727",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20190326Z-224832",
  "org.scalablytyped" %%% "eslint" % "4.16-dt-20190128Z-aa201c",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20190322Z-e82a53",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190604Z-47e6a1",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190606Z-ae49a5",
  "org.scalablytyped" %%% "html-minifier" % "3.5-dt-20190212Z-e8183b",
  "org.scalablytyped" %%% "html-webpack-plugin" % "3.2-dt-20181121Z-f5c502",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20190301Z-3d0d70",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20190114Z-74cb57",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20190212Z-013c97",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-51fe5c",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-76ef23",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-39a594",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20190322Z-3d98de",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-c829e9",
  "org.scalablytyped" %%% "source-map" % "0.7.3-b05be9",
  "org.scalablytyped" %%% "std" % "3.5-c5d119",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-f9cdac",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-e377d2",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190521Z-9a1e13",
  "org.scalablytyped" %%% "webpack-dev-server" % "3.1-dt-20190524Z-94cc1a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        