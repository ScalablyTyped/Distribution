organization := "org.scalablytyped"
name := "react-instantsearch"
version := "5.2-dt-20190605Z-22f67c"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "algoliasearch" % "3.34.0-dt-20191003Z-a150fb",
  "org.scalablytyped" %%% "algoliasearch-helper" % "2.26-dt-20190524Z-f7365a",
  "org.scalablytyped" %%% "csstype" % "2.6.6-1967d7",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191008Z-8637fd",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-e54803",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191003Z-3b437f",
  "org.scalablytyped" %%% "react-instantsearch-core" % "5.2-dt-20190605Z-e24931",
  "org.scalablytyped" %%% "react-instantsearch-dom" % "5.2-dt-20190909Z-9edd49",
  "org.scalablytyped" %%% "react-instantsearch-native" % "5.3-dt-20190909Z-a0dac0",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        