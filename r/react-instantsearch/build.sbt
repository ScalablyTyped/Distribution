organization := "org.scalablytyped"
name := "react-instantsearch"
version := "6.3-dt-20200323Z-27288c"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "algoliasearch" % "3.34.0-dt-20200226Z-fe6bd3",
  "org.scalablytyped" %%% "algoliasearch-helper" % "2.26-dt-20190524Z-ea2c30",
  "org.scalablytyped" %%% "csstype" % "2.6.9-313239",
  "org.scalablytyped" %%% "node" % "13.13-dt-20200417Z-f3d81d",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-11830c",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200409Z-0bc722",
  "org.scalablytyped" %%% "react-instantsearch-core" % "6.3-dt-20200323Z-d3da66",
  "org.scalablytyped" %%% "react-instantsearch-dom" % "6.3-dt-20200323Z-3b1e5c",
  "org.scalablytyped" %%% "std" % "3.8-9b2470")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
