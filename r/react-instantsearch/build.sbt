organization := "org.scalablytyped"
name := "react-instantsearch"
version := "6.3-dt-20200515Z-5d6074"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "algolia__cache-common" % "4.8.0-f0cea6",
  "org.scalablytyped" %%% "algolia__client-analytics" % "4.8.0-a75c9f",
  "org.scalablytyped" %%% "algolia__client-common" % "4.8.0-28dcab",
  "org.scalablytyped" %%% "algolia__client-recommendation" % "4.8.0-b57400",
  "org.scalablytyped" %%% "algolia__client-search" % "4.8.0-69c03e",
  "org.scalablytyped" %%% "algolia__logger-common" % "4.8.0-fdbb57",
  "org.scalablytyped" %%% "algolia__requester-common" % "4.8.0-1c03c5",
  "org.scalablytyped" %%% "algolia__transporter" % "4.8.0-c18b5b",
  "org.scalablytyped" %%% "algoliasearch" % "4.8.0-488bff",
  "org.scalablytyped" %%% "algoliasearch-helper" % "3.3.2-5e3c2d",
  "org.scalablytyped" %%% "csstype" % "2.6.14-b4f267",
  "org.scalablytyped" %%% "events" % "3.0-dt-20200515Z-c21624",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-7dc507",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-9253ae",
  "org.scalablytyped" %%% "react-instantsearch-core" % "6.3-dt-20200911Z-1cd6b9",
  "org.scalablytyped" %%% "react-instantsearch-dom" % "6.3-dt-20200515Z-904444",
  "org.scalablytyped" %%% "react-instantsearch-native" % "6.3-dt-20200323Z-418d3a",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
