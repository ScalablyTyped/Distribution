organization := "org.scalablytyped"
name := "react-ace"
version := "6.3.2-ca4995"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "brace" % "0.11.1-c3c567",
  "org.scalablytyped" %%% "csstype" % "2.5.8-ae54dc",
  "org.scalablytyped" %%% "diff-match-patch" % "1.0-dt-20180214Z-b363d6",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190116Z-e5b16b",
  "org.scalablytyped" %%% "lodash_dot_get" % "4.4-dt-20180723Z-d6abb8",
  "org.scalablytyped" %%% "lodash_dot_isequal" % "4.5-dt-20180723Z-4dbf79",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-8da1df",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-d610b9",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190201Z-1f77c5",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181127Z-9c8d5f",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        