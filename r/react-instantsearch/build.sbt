organization := "org.scalablytyped"
name := "react-instantsearch"
version := "5.2-dt-20190605Z-2857ee"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "algoliasearch" % "3.34.0-dt-20190923Z-23ed7a",
  "org.scalablytyped" %%% "algoliasearch-helper" % "2.26-dt-20190524Z-f643bb",
  "org.scalablytyped" %%% "csstype" % "2.6.6-f980df",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190911Z-da4655",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190903Z-bd378a",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190917Z-53b9fb",
  "org.scalablytyped" %%% "react-instantsearch-core" % "5.2-dt-20190605Z-f1afe8",
  "org.scalablytyped" %%% "react-instantsearch-dom" % "5.2-dt-20190909Z-bbc08e",
  "org.scalablytyped" %%% "react-instantsearch-native" % "5.3-dt-20190909Z-36bd16",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        