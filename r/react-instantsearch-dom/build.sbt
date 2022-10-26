organization := "org.scalablytyped"
name := "react-instantsearch-dom"
version := "6.12-dt-20220426Z-466d86"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "algolia__cache-common" % "4.14.2-6c6698",
  "org.scalablytyped" %%% "algolia__client-analytics" % "4.14.2-713a92",
  "org.scalablytyped" %%% "algolia__client-common" % "4.14.2-00c42a",
  "org.scalablytyped" %%% "algolia__client-personalization" % "4.14.2-a25af7",
  "org.scalablytyped" %%% "algolia__client-search" % "4.14.2-848fc5",
  "org.scalablytyped" %%% "algolia__events" % "4.0.1-bd679c",
  "org.scalablytyped" %%% "algolia__logger-common" % "4.14.2-2a72a0",
  "org.scalablytyped" %%% "algolia__requester-common" % "4.14.2-53d8f8",
  "org.scalablytyped" %%% "algolia__transporter" % "4.14.2-51aeeb",
  "org.scalablytyped" %%% "algoliasearch" % "4.14.2-9e856c",
  "org.scalablytyped" %%% "algoliasearch-helper" % "3.11.1-f3e218",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9ea52b",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-115604",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221025Z-ca420a",
  "org.scalablytyped" %%% "react-instantsearch-core" % "6.26-dt-20220720Z-3216f5",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-21791a",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
