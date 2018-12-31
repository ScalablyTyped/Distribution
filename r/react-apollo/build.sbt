organization := "org.scalablytyped"
name := "react-apollo"
version := "2.3.3-518cf2"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-cache" % "1.1.22-721748",
  "org.scalablytyped" %%% "apollo-client" % "2.4.8-7578c0",
  "org.scalablytyped" %%% "apollo-link" % "1.2.6-65536a",
  "org.scalablytyped" %%% "apollo-link-dedup" % "1.0.13-d54fd1",
  "org.scalablytyped" %%% "apollo-utilities" % "1.0.27-52f69b",
  "org.scalablytyped" %%% "csstype" % "2.5.8-a13970",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-353ee5",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20181016Z-ed78a4",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.0-dt-20180806Z-0ae6f5",
  "org.scalablytyped" %%% "invariant" % "2.2.0-dt-20180214Z-656266",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-0a02fb",
  "org.scalablytyped" %%% "lodash_dot_flowright" % "3.5-dt-20180723Z-2e51a7",
  "org.scalablytyped" %%% "lodash_dot_isequal" % "4.5-dt-20180723Z-f4d4fc",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-77ce7e",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-89199d",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181220Z-3dff88",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181127Z-8054fe",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-dc48cb",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-9c6819",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.13-80038a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        