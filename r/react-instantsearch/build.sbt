organization := "org.scalablytyped"
name := "react-instantsearch"
version := "5.2-dt-20190605Z-6d1cc5"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "algoliasearch" % "3.34.0-dt-20191014Z-6de453",
  "org.scalablytyped" %%% "algoliasearch-helper" % "2.26-dt-20190524Z-a33950",
  "org.scalablytyped" %%% "csstype" % "2.6.6-3eaa6f",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191119Z-94c257",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-8b44d5",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191025Z-132fef",
  "org.scalablytyped" %%% "react-instantsearch-core" % "5.2-dt-20191022Z-9c4ec1",
  "org.scalablytyped" %%% "react-instantsearch-dom" % "5.2-dt-20190909Z-4fcd50",
  "org.scalablytyped" %%% "react-instantsearch-native" % "5.3-dt-20190909Z-400125",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        