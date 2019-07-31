organization := "org.scalablytyped"
name := "react-dev-utils"
version := "9.0-dt-20190506Z-89d99c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-facedf",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-81b6cc",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20190130Z-29e973",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-65363d",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20190326Z-d0c6a5",
  "org.scalablytyped" %%% "eslint" % "4.16-dt-20190128Z-20579f",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20190322Z-35ffb4",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190604Z-8a448f",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190717Z-d99a71",
  "org.scalablytyped" %%% "html-minifier" % "3.5-dt-20190212Z-67e398",
  "org.scalablytyped" %%% "html-webpack-plugin" % "3.2-dt-20190712Z-c4863d",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20190301Z-012903",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20190114Z-3efe33",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20190717Z-ae8088",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-85a68c",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190731Z-f93e3e",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-223eff",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20190322Z-fa55c4",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-f9da0b",
  "org.scalablytyped" %%% "source-map" % "0.7.3-9427ea",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-86c6de",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-594357",
  "org.scalablytyped" %%% "webpack" % "4.32-dt-20190724Z-7b9bf9",
  "org.scalablytyped" %%% "webpack-dev-server" % "3.1-dt-20190710Z-e3b94c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        