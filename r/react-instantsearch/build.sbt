organization := "org.scalablytyped"
name := "react-instantsearch"
version := "6.10-dt-20220105Z-93f5ba"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "algolia__cache-common" % "4.14.2-b67f9d",
  "org.scalablytyped" %%% "algolia__client-analytics" % "4.14.2-a8ccac",
  "org.scalablytyped" %%% "algolia__client-common" % "4.14.2-31d18c",
  "org.scalablytyped" %%% "algolia__client-personalization" % "4.14.2-0e0440",
  "org.scalablytyped" %%% "algolia__client-search" % "4.14.2-a6b000",
  "org.scalablytyped" %%% "algolia__events" % "4.0.1-4aa8a9",
  "org.scalablytyped" %%% "algolia__logger-common" % "4.14.2-2e8dad",
  "org.scalablytyped" %%% "algolia__requester-common" % "4.14.2-cb80f2",
  "org.scalablytyped" %%% "algolia__transporter" % "4.14.2-e2ee64",
  "org.scalablytyped" %%% "algoliasearch" % "4.14.2-fdebac",
  "org.scalablytyped" %%% "algoliasearch-helper" % "3.11.1-aa03a4",
  "org.scalablytyped" %%% "csstype" % "3.1.1-4db30e",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-8a1cd9",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-cf549b",
  "org.scalablytyped" %%% "react-instantsearch-core" % "6.26-dt-20220720Z-6eaede",
  "org.scalablytyped" %%% "react-instantsearch-dom" % "6.12-dt-20220426Z-c29b0d",
  "org.scalablytyped" %%% "react-instantsearch-native" % "6.3-dt-20211202Z-3a9c84",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-6206c7",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
