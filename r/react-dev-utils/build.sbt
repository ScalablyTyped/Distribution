organization := "org.scalablytyped"
name := "react-dev-utils"
version := "7.0-dt-20190128Z-0c68e3"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-63350e",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-9f78fd",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20190130Z-f1046e",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-c85ddc",
  "org.scalablytyped" %%% "eslint" % "4.16-dt-20190128Z-a664d1",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20190322Z-3dc8da",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-4576ab",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190318Z-506446",
  "org.scalablytyped" %%% "html-minifier" % "3.5-dt-20190212Z-601c34",
  "org.scalablytyped" %%% "html-webpack-plugin" % "3.2-dt-20181121Z-7f8bea",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20190301Z-01359b",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20190114Z-261dd4",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20190212Z-7a5584",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-03fba5",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-d16283",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20190322Z-201072",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-604ebf",
  "org.scalablytyped" %%% "source-map" % "0.7.3-aac742",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-c2e5ed",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-5fcf02",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190316Z-1cc7c8",
  "org.scalablytyped" %%% "webpack-dev-server" % "3.1-dt-20190304Z-0130f5")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        