organization := "org.scalablytyped"
name := "react-toolbox"
version := "2.0.0-beta.13-7fcd44"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20181230Z-4ddc67",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180921Z-762c85",
  "org.scalablytyped" %%% "csstype" % "2.5.8-ae54dc",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.0-dt-20180806Z-282e3f",
  "org.scalablytyped" %%% "invariant" % "2.2.0-dt-20180214Z-61e110",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-8da1df",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-d610b9",
  "org.scalablytyped" %%% "ramda" % "0.25-dt-20190109Z-86618e",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190201Z-1f77c5",
  "org.scalablytyped" %%% "react-css-themr" % "2.1.2-907a1d",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181127Z-9c8d5f",
  "org.scalablytyped" %%% "react-transition-group" % "2.0-dt-20181219Z-d9b298",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        