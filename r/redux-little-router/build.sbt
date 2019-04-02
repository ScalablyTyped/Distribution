organization := "org.scalablytyped"
name := "redux-little-router"
version := "15.1.2-f0c3bd"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.3-431253",
  "org.scalablytyped" %%% "decode-uri-component" % "0.2-dt-20181208Z-c525f1",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20190322Z-992596",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190304Z-ee4549",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190329Z-69a948",
  "org.scalablytyped" %%% "lodash_dot_assign" % "4.2-dt-20190214Z-c21cf8",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190330Z-7c1cfd",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f7ff2b",
  "org.scalablytyped" %%% "query-string" % "6.4.2-851dd3",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190329Z-407a4c",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190322Z-348bcf",
  "org.scalablytyped" %%% "react-redux" % "7.0-dt-20190330Z-fa14ea",
  "org.scalablytyped" %%% "recompose" % "0.30-dt-20190322Z-feb316",
  "org.scalablytyped" %%% "redux" % "4.0.1-caedab",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "strict-uri-encode" % "2.0-dt-20180320Z-127e50",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-a7455c",
  "org.scalablytyped" %%% "url-pattern" % "1.0.3-77c89d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        