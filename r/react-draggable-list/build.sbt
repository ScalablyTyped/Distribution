organization := "org.scalablytyped"
name := "react-draggable-list"
version := "4.0.1-f9a13b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.5.8-36deb1",
  "org.scalablytyped" %%% "immutability-helper" % "3.0.0-d71ab6",
  "org.scalablytyped" %%% "invariant" % "2.2.0-dt-20180214Z-fd94ae",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-e51e1e",
  "org.scalablytyped" %%% "react" % "16.7-dt-20190128Z-cfd22c",
  "org.scalablytyped" %%% "react-motion" % "0.0-unknown-dt-20180806Z-6749ca",
  "org.scalablytyped" %%% "react-multi-ref" % "1.0.0-b8ef80",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        