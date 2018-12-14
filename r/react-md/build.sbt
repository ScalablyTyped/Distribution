organization := "org.scalablytyped"
name := "react-md"
version := "1.9.2-f32c2a"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20180910Z-4a9357",
  "org.scalablytyped" %%% "csstype" % "2.5.8-eb24f4",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-702cdc",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-32d5ea",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181213Z-7d04f8",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181122Z-71b187",
  "org.scalablytyped" %%% "react-motion" % "0.0-unknown-dt-20180910Z-5e842e",
  "org.scalablytyped" %%% "react-swipeable-views" % "0.12-dt-20180910Z-9349a2",
  "org.scalablytyped" %%% "react-transition-group" % "2.0-dt-20180910Z-8273af",
  "org.scalablytyped" %%% "resize-observer-polyfill" % "1.5.1-f5e410",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        