organization := "org.scalablytyped"
name := "react-instantsearch"
version := "5.2-dt-20190605Z-617008"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "algoliasearch" % "3.34.0-dt-20191014Z-43a7df",
  "org.scalablytyped" %%% "algoliasearch-helper" % "2.26-dt-20190524Z-b8afa0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-a93afc",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191125Z-959704",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-5cddf8",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191123Z-d1d56f",
  "org.scalablytyped" %%% "react-instantsearch-core" % "5.2-dt-20191022Z-d3fa5a",
  "org.scalablytyped" %%% "react-instantsearch-dom" % "5.2-dt-20190909Z-d85f93",
  "org.scalablytyped" %%% "react-instantsearch-native" % "5.3-dt-20190909Z-b81094",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        