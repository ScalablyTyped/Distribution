organization := "org.scalablytyped"
name := "react-instantsearch"
version := "5.2-dt-20190605Z-9a2d97"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "algoliasearch" % "3.30.2-dt-20190806Z-a1ecbb",
  "org.scalablytyped" %%% "algoliasearch-helper" % "2.26-dt-20190524Z-6f8f11",
  "org.scalablytyped" %%% "csstype" % "2.6.6-f01b27",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190820Z-2dc4df",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-f929bc",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190815Z-93079a",
  "org.scalablytyped" %%% "react-instantsearch-core" % "5.2-dt-20190605Z-5af751",
  "org.scalablytyped" %%% "react-instantsearch-dom" % "5.2-dt-20190605Z-e898be",
  "org.scalablytyped" %%% "react-instantsearch-native" % "5.3-dt-20190425Z-7c586e",
  "org.scalablytyped" %%% "std" % "3.5-cd493c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        