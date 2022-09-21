organization := "org.scalablytyped"
name := "react-instantsearch-dom"
version := "6.12-dt-20220426Z-1a2490"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "algolia__cache-common" % "4.14.2-e8f529",
  "org.scalablytyped" %%% "algolia__client-analytics" % "4.14.2-0d3a1f",
  "org.scalablytyped" %%% "algolia__client-common" % "4.14.2-16904b",
  "org.scalablytyped" %%% "algolia__client-personalization" % "4.14.2-c38afe",
  "org.scalablytyped" %%% "algolia__client-search" % "4.14.2-723d5c",
  "org.scalablytyped" %%% "algolia__events" % "4.0.1-136613",
  "org.scalablytyped" %%% "algolia__logger-common" % "4.14.2-c9aa2c",
  "org.scalablytyped" %%% "algolia__requester-common" % "4.14.2-37f229",
  "org.scalablytyped" %%% "algolia__transporter" % "4.14.2-d2cf2c",
  "org.scalablytyped" %%% "algoliasearch" % "4.14.2-441011",
  "org.scalablytyped" %%% "algoliasearch-helper" % "3.11.1-01e80b",
  "org.scalablytyped" %%% "csstype" % "3.1.1-7b6cf2",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-737217",
  "org.scalablytyped" %%% "react" % "18.0-dt-20220913Z-bad9e4",
  "org.scalablytyped" %%% "react-instantsearch-core" % "6.26-dt-20220720Z-ce73a4",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-fce63f",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
