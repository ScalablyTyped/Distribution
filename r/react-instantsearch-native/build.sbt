organization := "org.scalablytyped"
name := "react-instantsearch-native"
version := "6.3-dt-20211202Z-3f946b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "algolia__cache-common" % "4.14.2-0f67b5",
  "org.scalablytyped" %%% "algolia__client-analytics" % "4.14.2-76706a",
  "org.scalablytyped" %%% "algolia__client-common" % "4.14.2-ad6626",
  "org.scalablytyped" %%% "algolia__client-personalization" % "4.14.2-81b1bd",
  "org.scalablytyped" %%% "algolia__client-search" % "4.14.2-e36e98",
  "org.scalablytyped" %%% "algolia__events" % "4.0.1-851563",
  "org.scalablytyped" %%% "algolia__logger-common" % "4.14.2-ca8844",
  "org.scalablytyped" %%% "algolia__requester-common" % "4.14.2-983996",
  "org.scalablytyped" %%% "algolia__transporter" % "4.14.2-3f1e9b",
  "org.scalablytyped" %%% "algoliasearch" % "4.14.2-a3da19",
  "org.scalablytyped" %%% "algoliasearch-helper" % "3.11.1-1f69ed",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9b270c",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-9c1d48",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-c1aa2f",
  "org.scalablytyped" %%% "react-instantsearch-core" % "6.26-dt-20220720Z-16713a",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-fd69ea",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
