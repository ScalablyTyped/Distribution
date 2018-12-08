organization := "org.scalablytyped"
name := "react-apollo"
version := "2.3.2-59817e"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-cache" % "1.1.21-ef1703",
  "org.scalablytyped" %%% "apollo-client" % "2.4.7-813483",
  "org.scalablytyped" %%% "apollo-link" % "1.2.4-f5ddbe",
  "org.scalablytyped" %%% "apollo-link-dedup" % "1.0.11-53a150",
  "org.scalablytyped" %%% "apollo-utilities" % "1.0.26-181e22",
  "org.scalablytyped" %%% "csstype" % "2.5.8-bb2c56",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20181018Z-f94ee7",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.0-dt-20180910Z-2965d0",
  "org.scalablytyped" %%% "invariant" % "2.2.0-dt-20180910Z-cbed6e",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-3dc8be",
  "org.scalablytyped" %%% "lodash_dot_flowright" % "3.5-dt-20180910Z-a9fcc1",
  "org.scalablytyped" %%% "lodash_dot_isequal" % "4.5-dt-20180910Z-ad0ca4",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181208Z-000ab2",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181203Z-1b8e7c",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-46014e",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180910Z-cf13fe",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.11-203351")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        