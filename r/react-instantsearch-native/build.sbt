organization := "org.scalablytyped"
name := "react-instantsearch-native"
version := "6.3-dt-20200323Z-9b95db"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "algolia__cache-common" % "4.3.1-56cdfc",
  "org.scalablytyped" %%% "algolia__client-analytics" % "4.3.1-5a9498",
  "org.scalablytyped" %%% "algolia__client-common" % "4.3.1-55c6b0",
  "org.scalablytyped" %%% "algolia__client-recommendation" % "4.3.1-e7890a",
  "org.scalablytyped" %%% "algolia__client-search" % "4.3.1-983ea4",
  "org.scalablytyped" %%% "algolia__logger-common" % "4.3.1-6d87d4",
  "org.scalablytyped" %%% "algolia__requester-common" % "4.3.1-0443b4",
  "org.scalablytyped" %%% "algolia__transporter" % "4.3.1-41e4e0",
  "org.scalablytyped" %%% "algoliasearch" % "4.3.1-05f1bb",
  "org.scalablytyped" %%% "algoliasearch-helper" % "3.2.2-00abbf",
  "org.scalablytyped" %%% "csstype" % "3.0.2-b6fa26",
  "org.scalablytyped" %%% "events" % "3.0-dt-20200515Z-b9b179",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-64dc32",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200711Z-7368c8",
  "org.scalablytyped" %%% "react-instantsearch-core" % "6.3-dt-20200323Z-5f4cd1",
  "org.scalablytyped" %%% "std" % "3.9-bafc13")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
