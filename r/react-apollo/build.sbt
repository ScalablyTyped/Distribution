organization := "org.scalablytyped"
name := "react-apollo"
version := "2.4.1-5b3f76"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-cache" % "1.1.25-68cd05",
  "org.scalablytyped" %%% "apollo-client" % "2.4.12-c9dc54",
  "org.scalablytyped" %%% "apollo-link" % "1.2.6-cc52df",
  "org.scalablytyped" %%% "apollo-link-dedup" % "1.0.13-314922",
  "org.scalablytyped" %%% "apollo-utilities" % "1.0.27-66344e",
  "org.scalablytyped" %%% "csstype" % "2.5.8-ae54dc",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-ddf996",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20190107Z-5c65a8",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.0-dt-20180806Z-25c871",
  "org.scalablytyped" %%% "invariant" % "2.2.0-dt-20180214Z-61e110",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190116Z-e5b16b",
  "org.scalablytyped" %%% "lodash_dot_flowright" % "3.5-dt-20180723Z-871ecb",
  "org.scalablytyped" %%% "lodash_dot_isequal" % "4.5-dt-20180723Z-4dbf79",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-92720c",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-d610b9",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190131Z-997ec6",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181127Z-e377db",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-607a2a",
  "org.scalablytyped" %%% "tslib" % "1.9.3-856848",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-0cbed1",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.13-29c689")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        