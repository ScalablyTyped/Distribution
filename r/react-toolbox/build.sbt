organization := "com.scalablytyped"
name := "react-toolbox"
version := "2.0.0-beta.13-9554ee"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "classnames" % "2.2-dt-20180910Z-d2b0a8",
  "com.scalablytyped" %%% "core-js" % "2.5-dt-20180927Z-afbfd8",
  "com.scalablytyped" %%% "csstype" % "2.5.7-d075d3",
  "com.scalablytyped" %%% "hoist-non-react-statics" % "3.0-dt-20180910Z-05e35b",
  "com.scalablytyped" %%% "invariant" % "2.2.0-dt-20180910Z-118bf2",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181203Z-7004b3",
  "com.scalablytyped" %%% "prop-types" % "15.5-dt-20180927Z-c5aad4",
  "com.scalablytyped" %%% "ramda" % "0.25-dt-20181120Z-b95e9d",
  "com.scalablytyped" %%% "react" % "16.7-dt-20181203Z-843f9f",
  "com.scalablytyped" %%% "react-css-themr" % "2.1.2-8d1574",
  "com.scalablytyped" %%% "react-dom" % "16.0-dt-20181122Z-0eb952",
  "com.scalablytyped" %%% "react-transition-group" % "2.0-dt-20180910Z-035397",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        