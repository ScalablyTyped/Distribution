organization := "org.scalablytyped"
name := "react-draggable-list"
version := "4.0.1-a24d5e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.5.8-ae54dc",
  "org.scalablytyped" %%% "immutability-helper" % "3.0.0-ec2777",
  "org.scalablytyped" %%% "invariant" % "2.2.0-dt-20180214Z-61e110",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-d610b9",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190201Z-1f77c5",
  "org.scalablytyped" %%% "react-motion" % "0.0-unknown-dt-20180806Z-f92795",
  "org.scalablytyped" %%% "react-multi-ref" % "1.0.0-a241e4",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        