organization := "org.scalablytyped"
name := "react-instantsearch-dom"
version := "6.3-dt-20200515Z-fd7a6a"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "algolia__cache-common" % "4.8.0-815a1f",
  "org.scalablytyped" %%% "algolia__client-analytics" % "4.8.0-42c45f",
  "org.scalablytyped" %%% "algolia__client-common" % "4.8.0-e7fc4c",
  "org.scalablytyped" %%% "algolia__client-recommendation" % "4.8.0-8bfb8c",
  "org.scalablytyped" %%% "algolia__client-search" % "4.8.0-de94e8",
  "org.scalablytyped" %%% "algolia__logger-common" % "4.8.0-1c95d3",
  "org.scalablytyped" %%% "algolia__requester-common" % "4.8.0-228e70",
  "org.scalablytyped" %%% "algolia__transporter" % "4.8.0-339222",
  "org.scalablytyped" %%% "algoliasearch" % "4.8.0-925c25",
  "org.scalablytyped" %%% "algoliasearch-helper" % "3.3.2-68f66d",
  "org.scalablytyped" %%% "csstype" % "2.6.14-dc2f99",
  "org.scalablytyped" %%% "events" % "3.0-dt-20200515Z-6e62ad",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-3fbed9",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-4ff700",
  "org.scalablytyped" %%% "react-instantsearch-core" % "6.3-dt-20200911Z-ff750a",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
