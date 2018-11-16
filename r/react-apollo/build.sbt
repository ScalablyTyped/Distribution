organization := "com.scalablytyped"
name := "react-apollo"
version := "2.2.4-84c64d"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "apollo-cache" % "1.1.20-7180f1",
  "com.scalablytyped" %%% "apollo-client" % "2.4.5-3f08a7",
  "com.scalablytyped" %%% "apollo-link" % "1.2.3-373593",
  "com.scalablytyped" %%% "apollo-link-dedup" % "1.0.10-d9084c",
  "com.scalablytyped" %%% "apollo-utilities" % "1.0.25-13c381",
  "com.scalablytyped" %%% "csstype" % "2.5.7-8f5757",
  "com.scalablytyped" %%% "graphql" % "14.0-dt-20181102Z-c82035",
  "com.scalablytyped" %%% "hoist-non-react-statics" % "3.0-dt-20181102Z-ae7b69",
  "com.scalablytyped" %%% "invariant" % "2.2.0-dt-20181102Z-6e50ec",
  "com.scalablytyped" %%% "lodash" % "4.14-dt-20181109Z-67570f",
  "com.scalablytyped" %%% "lodash_dot_flowright" % "3.5-dt-20181102Z-7b68a3",
  "com.scalablytyped" %%% "lodash_dot_isequal" % "4.5-dt-20181102Z-853c2e",
  "com.scalablytyped" %%% "prop-types" % "15.5-dt-20181102Z-3c49da",
  "com.scalablytyped" %%% "react" % "16.7-dt-20181116Z-28281f",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "com.scalablytyped" %%% "symbol-observable" % "1.2.0-998bd5",
  "com.scalablytyped" %%% "zen-observable" % "0.8-dt-20181102Z-e5f69d",
  "com.scalablytyped" %%% "zen-observable-ts" % "0.8.10-c8cd90",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        