organization := "org.scalablytyped"
name := "react-instantsearch"
version := "5.2-dt-20190605Z-dc4309"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "algoliasearch" % "3.30.1-dt-20190521Z-2ca1fa",
  "org.scalablytyped" %%% "algoliasearch-helper" % "2.26-dt-20190524Z-9442c3",
  "org.scalablytyped" %%% "csstype" % "2.6.5-523284",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190708Z-e1e986",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-c6e514",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190703Z-5fe923",
  "org.scalablytyped" %%% "react-instantsearch-core" % "5.2-dt-20190605Z-af156c",
  "org.scalablytyped" %%% "react-instantsearch-dom" % "5.2-dt-20190605Z-54c3e9",
  "org.scalablytyped" %%% "react-instantsearch-native" % "5.3-dt-20190425Z-a7a93d",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        