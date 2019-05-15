organization := "org.scalablytyped"
name := "react-instantsearch"
version := "5.2-dt-20190426Z-375284"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "algoliasearch" % "3.30.1-dt-20190514Z-cf14d4",
  "org.scalablytyped" %%% "algoliasearch-helper" % "2.26-dt-20190212Z-fe7ede",
  "org.scalablytyped" %%% "csstype" % "2.6.3-225f24",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190514Z-07594f",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-ff94fb",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190508Z-49bfe5",
  "org.scalablytyped" %%% "react-instantsearch-core" % "5.2-dt-20190425Z-0ff855",
  "org.scalablytyped" %%% "react-instantsearch-dom" % "5.2-dt-20190425Z-e6f925",
  "org.scalablytyped" %%% "react-instantsearch-native" % "5.3-dt-20190425Z-972d17",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        