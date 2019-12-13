organization := "org.scalablytyped"
name := "react-instantsearch"
version := "5.2-dt-20191126Z-c24ba0"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "algoliasearch" % "3.34.0-dt-20191206Z-724181",
  "org.scalablytyped" %%% "algoliasearch-helper" % "2.26-dt-20190524Z-5d18dd",
  "org.scalablytyped" %%% "csstype" % "2.6.6-a93afc",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191210Z-b5c359",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-5cddf8",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191209Z-f85fa6",
  "org.scalablytyped" %%% "react-instantsearch-core" % "5.2-dt-20191022Z-88c5ce",
  "org.scalablytyped" %%% "react-instantsearch-dom" % "5.2-dt-20191126Z-b955be",
  "org.scalablytyped" %%% "react-instantsearch-native" % "5.3-dt-20190909Z-af99be",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        