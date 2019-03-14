organization := "org.scalablytyped"
name := "react-instantsearch"
version := "5.2-dt-20190215Z-88408f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "algoliasearch" % "3.30.1-dt-20190312Z-7c32fa",
  "org.scalablytyped" %%% "algoliasearch-helper" % "2.26-dt-20190212Z-75b8d9",
  "org.scalablytyped" %%% "csstype" % "2.6.3-29f798",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190313Z-f6d9fe",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f878d0",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190312Z-6f0f1a",
  "org.scalablytyped" %%% "react-instantsearch-core" % "5.2-dt-20190222Z-7366bd",
  "org.scalablytyped" %%% "react-instantsearch-dom" % "5.2-dt-20190215Z-05e274",
  "org.scalablytyped" %%% "react-instantsearch-native" % "5.3-dt-20190215Z-55b3cb",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        