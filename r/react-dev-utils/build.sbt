organization := "org.scalablytyped"
name := "react-dev-utils"
version := "7.0-dt-20190327Z-2d3171"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-4b6b4d",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-3d760a",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20190130Z-db6b19",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-b0fe56",
  "org.scalablytyped" %%% "eslint" % "4.16-dt-20190128Z-91813b",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20190322Z-ef0969",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-e7b69f",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190423Z-a7e7ca",
  "org.scalablytyped" %%% "html-minifier" % "3.5-dt-20190212Z-f2c75e",
  "org.scalablytyped" %%% "html-webpack-plugin" % "3.2-dt-20181121Z-e25198",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20190301Z-82ff6c",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20190114Z-7f666e",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20190212Z-d1c548",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-b7b3da",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190426Z-d35e72",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c3b9c7",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20190322Z-8b29e0",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-1ae06d",
  "org.scalablytyped" %%% "source-map" % "0.7.3-3d82c0",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-f8c6f2",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-e5143c",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190411Z-9c5ec5",
  "org.scalablytyped" %%% "webpack-dev-server" % "3.1-dt-20190330Z-d01f0e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        