organization := "org.scalablytyped"
name := "redux-little-router"
version := "15.1.2-3f9493"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.3-60f3ea",
  "org.scalablytyped" %%% "decode-uri-component" % "0.2-dt-20181208Z-2b0103",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20190226Z-e317ff",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190304Z-421c03",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190227Z-56553a",
  "org.scalablytyped" %%% "lodash_dot_assign" % "4.2-dt-20190214Z-b38e61",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190307Z-7720a8",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-0b0b5e",
  "org.scalablytyped" %%% "query-string" % "6.3.0-a351bc",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190306Z-d5c6e1",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190213Z-768022",
  "org.scalablytyped" %%% "react-redux" % "7.0-dt-20190306Z-5b6975",
  "org.scalablytyped" %%% "recompose" % "0.30-dt-20190225Z-87982b",
  "org.scalablytyped" %%% "redux" % "4.0.1-03a2e6",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "strict-uri-encode" % "2.0-dt-20180320Z-db6404",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-bfac6c",
  "org.scalablytyped" %%% "url-pattern" % "1.0.3-67bf3f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        