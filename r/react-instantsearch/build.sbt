organization := "org.scalablytyped"
name := "react-instantsearch"
version := "5.2-dt-20190605Z-651d82"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "algoliasearch" % "3.30.2-dt-20190830Z-dfc9b0",
  "org.scalablytyped" %%% "algoliasearch-helper" % "2.26-dt-20190524Z-5a39d1",
  "org.scalablytyped" %%% "csstype" % "2.6.6-f980df",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190820Z-c250b3",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-fd4af0",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190815Z-6dcbc8",
  "org.scalablytyped" %%% "react-instantsearch-core" % "5.2-dt-20190605Z-4d5fc0",
  "org.scalablytyped" %%% "react-instantsearch-dom" % "5.2-dt-20190605Z-78438a",
  "org.scalablytyped" %%% "react-instantsearch-native" % "5.3-dt-20190425Z-01f87e",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        