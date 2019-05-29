organization := "org.scalablytyped"
name := "react-instantsearch-native"
version := "5.3-dt-20190425Z-3479bc"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "algoliasearch" % "3.30.1-dt-20190521Z-4dfb81",
  "org.scalablytyped" %%% "algoliasearch-helper" % "2.26-dt-20190524Z-7a38c3",
  "org.scalablytyped" %%% "csstype" % "2.6.4-a0e5c1",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190528Z-17198b",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-b94c72",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190528Z-1cea03",
  "org.scalablytyped" %%% "react-instantsearch-core" % "5.2-dt-20190425Z-6457ff",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        