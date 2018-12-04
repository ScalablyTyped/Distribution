organization := "com.scalablytyped"
name := "react-apollo"
version := "2.3.2-558ad3"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "apollo-cache" % "1.1.21-0215b5",
  "com.scalablytyped" %%% "apollo-client" % "2.4.7-fbaad8",
  "com.scalablytyped" %%% "apollo-link" % "1.2.4-cf91b1",
  "com.scalablytyped" %%% "apollo-link-dedup" % "1.0.11-bec2f1",
  "com.scalablytyped" %%% "apollo-utilities" % "1.0.26-9dddf4",
  "com.scalablytyped" %%% "csstype" % "2.5.7-d075d3",
  "com.scalablytyped" %%% "graphql" % "14.0-dt-20181018Z-dd545c",
  "com.scalablytyped" %%% "hoist-non-react-statics" % "3.0-dt-20180910Z-05e35b",
  "com.scalablytyped" %%% "invariant" % "2.2.0-dt-20180910Z-118bf2",
  "com.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-0335c2",
  "com.scalablytyped" %%% "lodash_dot_flowright" % "3.5-dt-20180910Z-2ca64b",
  "com.scalablytyped" %%% "lodash_dot_isequal" % "4.5-dt-20180910Z-3660e0",
  "com.scalablytyped" %%% "prop-types" % "15.5-dt-20180927Z-c5aad4",
  "com.scalablytyped" %%% "react" % "16.7-dt-20181203Z-843f9f",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "symbol-observable" % "1.2.0-45b962",
  "com.scalablytyped" %%% "zen-observable" % "0.8-dt-20180910Z-854602",
  "com.scalablytyped" %%% "zen-observable-ts" % "0.8.11-bacf6e",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        