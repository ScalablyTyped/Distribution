organization := "org.scalablytyped"
name := "react-instantsearch"
version := "5.2-dt-20190215Z-268f1f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "algoliasearch" % "3.30.1-dt-20190404Z-8c717e",
  "org.scalablytyped" %%% "algoliasearch-helper" % "2.26-dt-20190212Z-c7b56d",
  "org.scalablytyped" %%% "csstype" % "2.6.3-61d3d0",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190419Z-3f0246",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-7e744c",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190419Z-caf3c8",
  "org.scalablytyped" %%% "react-instantsearch-core" % "5.2-dt-20190330Z-5dab1b",
  "org.scalablytyped" %%% "react-instantsearch-dom" % "5.2-dt-20190215Z-595fd7",
  "org.scalablytyped" %%% "react-instantsearch-native" % "5.3-dt-20190215Z-7337b4",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        