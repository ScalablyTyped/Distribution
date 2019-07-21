organization := "org.scalablytyped"
name := "react-dev-utils"
version := "9.0-dt-20190506Z-0fbd72"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-630d1b",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-9c543c",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20190130Z-b1f6a8",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-e1c7d7",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20190326Z-2b3062",
  "org.scalablytyped" %%% "eslint" % "4.16-dt-20190128Z-d96ac4",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20190322Z-f5e4db",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190604Z-e6cc14",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190717Z-2e57f1",
  "org.scalablytyped" %%% "html-minifier" % "3.5-dt-20190212Z-0d4116",
  "org.scalablytyped" %%% "html-webpack-plugin" % "3.2-dt-20190712Z-099cf2",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20190301Z-57b523",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20190114Z-25971f",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20190717Z-dda583",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-1c84be",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190717Z-e46800",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-f16918",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20190322Z-283dc5",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-43ad97",
  "org.scalablytyped" %%% "source-map" % "0.7.3-11ec74",
  "org.scalablytyped" %%% "std" % "3.5-983486",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-a00acf",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-8dc4d2",
  "org.scalablytyped" %%% "webpack" % "4.32-dt-20190719Z-3e0fb6",
  "org.scalablytyped" %%% "webpack-dev-server" % "3.1-dt-20190710Z-6def95")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        