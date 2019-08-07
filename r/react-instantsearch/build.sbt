organization := "org.scalablytyped"
name := "react-instantsearch"
version := "5.2-dt-20190605Z-fe3e86"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "algoliasearch" % "3.30.2-dt-20190806Z-504685",
  "org.scalablytyped" %%% "algoliasearch-helper" % "2.26-dt-20190524Z-62e589",
  "org.scalablytyped" %%% "csstype" % "2.6.6-7e82e4",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190806Z-18826b",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-f48590",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190731Z-e8f22e",
  "org.scalablytyped" %%% "react-instantsearch-core" % "5.2-dt-20190605Z-294c6e",
  "org.scalablytyped" %%% "react-instantsearch-dom" % "5.2-dt-20190605Z-dd2b7b",
  "org.scalablytyped" %%% "react-instantsearch-native" % "5.3-dt-20190425Z-2ebaa9",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        