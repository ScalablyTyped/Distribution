organization := "org.scalablytyped"
name := "react-dnd-multi-backend"
version := "3.0-dt-20190306Z-2d4155"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "asap" % "2.0-dt-20180629Z-0f4a84",
  "org.scalablytyped" %%% "csstype" % "2.6.3-431253",
  "org.scalablytyped" %%% "dnd-core" % "7.4.0-0c8571",
  "org.scalablytyped" %%% "invariant" % "2.2.0-dt-20190322Z-4a316b",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190329Z-69a948",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f7ff2b",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190329Z-407a4c",
  "org.scalablytyped" %%% "redux" % "4.0.1-caedab",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-a7455c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        