organization := "org.scalablytyped"
name := "react-apollo"
version := "2.3.3-707b14"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-cache" % "1.1.23-8ef58c",
  "org.scalablytyped" %%% "apollo-client" % "2.4.9-43f8f5",
  "org.scalablytyped" %%% "apollo-link" % "1.2.6-dc6387",
  "org.scalablytyped" %%% "apollo-link-dedup" % "1.0.13-d78e45",
  "org.scalablytyped" %%% "apollo-utilities" % "1.0.27-c9719d",
  "org.scalablytyped" %%% "csstype" % "2.5.8-36deb1",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-c8d4b8",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20190107Z-b6e998",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.0-dt-20180806Z-708399",
  "org.scalablytyped" %%% "invariant" % "2.2.0-dt-20180214Z-fd94ae",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190116Z-c48db4",
  "org.scalablytyped" %%% "lodash_dot_flowright" % "3.5-dt-20180723Z-f07a2e",
  "org.scalablytyped" %%% "lodash_dot_isequal" % "4.5-dt-20180723Z-151a38",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-7438ae",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-e51e1e",
  "org.scalablytyped" %%% "react" % "16.7-dt-20190116Z-73addc",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181127Z-99d6f9",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-bc5916",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-5cf802",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.13-e9f354")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        