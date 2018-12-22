organization := "org.scalablytyped"
name := "react-apollo"
version := "2.3.3-32a466"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-cache" % "1.1.22-bd6cd1",
  "org.scalablytyped" %%% "apollo-client" % "2.4.8-7a3c80",
  "org.scalablytyped" %%% "apollo-link" % "1.2.6-5dd416",
  "org.scalablytyped" %%% "apollo-link-dedup" % "1.0.13-5eb02d",
  "org.scalablytyped" %%% "apollo-utilities" % "1.0.27-084adf",
  "org.scalablytyped" %%% "csstype" % "2.5.8-28635b",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20181016Z-3245d4",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.0-dt-20180806Z-9becb0",
  "org.scalablytyped" %%% "invariant" % "2.2.0-dt-20180214Z-ed559c",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-b7dcf8",
  "org.scalablytyped" %%% "lodash_dot_flowright" % "3.5-dt-20180723Z-746d8b",
  "org.scalablytyped" %%% "lodash_dot_isequal" % "4.5-dt-20180723Z-8a9cff",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-e45326",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-3109dd",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181220Z-b38950",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181127Z-d008b6",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-43e3c6",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-76c70f",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.13-850d40")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        