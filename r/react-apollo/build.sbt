organization := "org.scalablytyped"
name := "react-apollo"
version := "2.5.3-06cfbf"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-cache" % "1.2.1-988a28",
  "org.scalablytyped" %%% "apollo-client" % "2.5.1-c9db34",
  "org.scalablytyped" %%% "apollo-link" % "1.2.11-0d8242",
  "org.scalablytyped" %%% "apollo-link-dedup" % "1.0.18-7b906b",
  "org.scalablytyped" %%% "apollo-utilities" % "1.2.1-5d92c5",
  "org.scalablytyped" %%% "csstype" % "2.6.3-431253",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-82585c",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190329Z-d9f4a2",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190304Z-ee4549",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190329Z-69a948",
  "org.scalablytyped" %%% "lodash_dot_isequal" % "4.5-dt-20190214Z-c3cf18",
  "org.scalablytyped" %%% "node" % "11.12-dt-20190330Z-e2b8de",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f7ff2b",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190329Z-407a4c",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190322Z-3be409",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-a7455c",
  "org.scalablytyped" %%% "ts-invariant" % "0.3.2-e57298",
  "org.scalablytyped" %%% "tslib" % "1.9.3-446b32",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-c37980",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.18-abdcc5")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        