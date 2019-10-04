organization := "org.scalablytyped"
name := "react-instantsearch"
version := "5.2-dt-20190605Z-dbfddb"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "algoliasearch" % "3.34.0-dt-20191003Z-434976",
  "org.scalablytyped" %%% "algoliasearch-helper" % "2.26-dt-20190524Z-d11787",
  "org.scalablytyped" %%% "csstype" % "2.6.6-f980df",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191003Z-e91184",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-06c3ac",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191003Z-b3917f",
  "org.scalablytyped" %%% "react-instantsearch-core" % "5.2-dt-20190605Z-b0d3b0",
  "org.scalablytyped" %%% "react-instantsearch-dom" % "5.2-dt-20190909Z-ff132b",
  "org.scalablytyped" %%% "react-instantsearch-native" % "5.3-dt-20190909Z-678239",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        