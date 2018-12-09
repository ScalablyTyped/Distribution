organization := "org.scalablytyped"
name := "react-toolbox"
version := "2.0.0-beta.13-192167"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20180910Z-09df87",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180927Z-41c841",
  "org.scalablytyped" %%% "csstype" % "2.5.8-b451f0",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.0-dt-20180910Z-dc38e6",
  "org.scalablytyped" %%% "invariant" % "2.2.0-dt-20180910Z-2f0248",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-646a31",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181208Z-87c4ee",
  "org.scalablytyped" %%% "ramda" % "0.25-dt-20181208Z-2c136e",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181203Z-d83ef6",
  "org.scalablytyped" %%% "react-css-themr" % "2.1.2-868705",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181122Z-d04ae5",
  "org.scalablytyped" %%% "react-transition-group" % "2.0-dt-20180910Z-65045f",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        