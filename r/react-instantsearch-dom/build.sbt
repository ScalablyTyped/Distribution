organization := "org.scalablytyped"
name := "react-instantsearch-dom"
version := "6.12-dt-20220426Z-8d73ba"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "algolia__cache-common" % "4.14.2-36e821",
  "org.scalablytyped" %%% "algolia__client-analytics" % "4.14.2-4bd86a",
  "org.scalablytyped" %%% "algolia__client-common" % "4.14.2-23d76d",
  "org.scalablytyped" %%% "algolia__client-personalization" % "4.14.2-8f5b4f",
  "org.scalablytyped" %%% "algolia__client-search" % "4.14.2-81afdb",
  "org.scalablytyped" %%% "algolia__events" % "4.0.1-f01d4f",
  "org.scalablytyped" %%% "algolia__logger-common" % "4.14.2-b2099b",
  "org.scalablytyped" %%% "algolia__requester-common" % "4.14.2-cdbcfa",
  "org.scalablytyped" %%% "algolia__transporter" % "4.14.2-adaf1e",
  "org.scalablytyped" %%% "algoliasearch" % "4.14.2-486c7d",
  "org.scalablytyped" %%% "algoliasearch-helper" % "3.11.1-27aaa2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-775404",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-4c7983",
  "org.scalablytyped" %%% "react" % "18.0-dt-20220922Z-bacd1f",
  "org.scalablytyped" %%% "react-instantsearch-core" % "6.26-dt-20220720Z-ddf885",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-400bee",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
