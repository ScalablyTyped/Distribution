organization := "org.scalablytyped"
name := "react-toolbox"
version := "2.0.0-beta.13-9b0e26"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20181230Z-df7a56",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180921Z-cb17b2",
  "org.scalablytyped" %%% "csstype" % "2.6.2-522be0",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.0-dt-20180806Z-8c061a",
  "org.scalablytyped" %%% "invariant" % "2.2.0-dt-20180214Z-d5355c",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190206Z-9f73ab",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-8cdf18",
  "org.scalablytyped" %%% "ramda" % "0.25-dt-20190206Z-fc958a",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190206Z-d66e8f",
  "org.scalablytyped" %%% "react-css-themr" % "2.1.2-dab359",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190206Z-6fba4f",
  "org.scalablytyped" %%% "react-transition-group" % "2.0-dt-20181219Z-78bce0",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        