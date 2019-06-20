organization := "org.scalablytyped"
name := "react-instantsearch"
version := "5.2-dt-20190605Z-6198d5"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "algoliasearch" % "3.30.1-dt-20190521Z-969526",
  "org.scalablytyped" %%% "algoliasearch-helper" % "2.26-dt-20190524Z-c88c08",
  "org.scalablytyped" %%% "csstype" % "2.6.5-e47d18",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-b8909f",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-2a42a7",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190619Z-8d8143",
  "org.scalablytyped" %%% "react-instantsearch-core" % "5.2-dt-20190605Z-6d4b4b",
  "org.scalablytyped" %%% "react-instantsearch-dom" % "5.2-dt-20190605Z-67543a",
  "org.scalablytyped" %%% "react-instantsearch-native" % "5.3-dt-20190425Z-93b5df",
  "org.scalablytyped" %%% "std" % "3.5-d4a303")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        