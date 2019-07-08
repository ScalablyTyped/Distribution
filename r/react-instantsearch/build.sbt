organization := "org.scalablytyped"
name := "react-instantsearch"
version := "5.2-dt-20190605Z-10f921"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "algoliasearch" % "3.30.1-dt-20190521Z-2ca1fa",
  "org.scalablytyped" %%% "algoliasearch-helper" % "2.26-dt-20190524Z-4a06fa",
  "org.scalablytyped" %%% "csstype" % "2.6.5-523284",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190703Z-a67e53",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-c6e514",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190703Z-5fe923",
  "org.scalablytyped" %%% "react-instantsearch-core" % "5.2-dt-20190605Z-e2bcee",
  "org.scalablytyped" %%% "react-instantsearch-dom" % "5.2-dt-20190605Z-e86c55",
  "org.scalablytyped" %%% "react-instantsearch-native" % "5.3-dt-20190425Z-006609",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        