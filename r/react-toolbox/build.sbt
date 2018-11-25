organization := "com.scalablytyped"
name := "react-toolbox"
version := "2.0.0-beta.13-bd21d8"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "classnames" % "2.2-dt-20180910Z-d7884f",
  "com.scalablytyped" %%% "core-js" % "2.5-dt-20180927Z-c4dd38",
  "com.scalablytyped" %%% "csstype" % "2.5.7-eccde3",
  "com.scalablytyped" %%% "hoist-non-react-statics" % "3.0-dt-20180910Z-19b6d2",
  "com.scalablytyped" %%% "invariant" % "2.2.0-dt-20180910Z-c8b620",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181121Z-5a910f",
  "com.scalablytyped" %%% "prop-types" % "15.5-dt-20180927Z-7b533e",
  "com.scalablytyped" %%% "ramda" % "0.25-dt-20181120Z-96bbd8",
  "com.scalablytyped" %%% "react" % "16.7-dt-20181122Z-2ddd12",
  "com.scalablytyped" %%% "react-css-themr" % "2.1.2-37117d",
  "com.scalablytyped" %%% "react-dom" % "16.0-dt-20181122Z-edcdde",
  "com.scalablytyped" %%% "react-transition-group" % "2.0-dt-20180910Z-b9d453",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        