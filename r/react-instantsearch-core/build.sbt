organization := "org.scalablytyped"
name := "react-instantsearch-core"
version := "6.26-dt-20220720Z-4a6b32"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "algolia__cache-common" % "4.14.2-3533db",
  "org.scalablytyped" %%% "algolia__client-analytics" % "4.14.2-93b107",
  "org.scalablytyped" %%% "algolia__client-common" % "4.14.2-f7713f",
  "org.scalablytyped" %%% "algolia__client-personalization" % "4.14.2-d18553",
  "org.scalablytyped" %%% "algolia__client-search" % "4.14.2-b4ebe7",
  "org.scalablytyped" %%% "algolia__events" % "4.0.1-3cbe13",
  "org.scalablytyped" %%% "algolia__logger-common" % "4.14.2-135c88",
  "org.scalablytyped" %%% "algolia__requester-common" % "4.14.2-1eaa5b",
  "org.scalablytyped" %%% "algolia__transporter" % "4.14.2-908ae3",
  "org.scalablytyped" %%% "algoliasearch" % "4.14.2-e636f9",
  "org.scalablytyped" %%% "algoliasearch-helper" % "3.11.1-6710d1",
  "org.scalablytyped" %%% "csstype" % "3.1.1-0912f8",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-975e63",
  "org.scalablytyped" %%% "react" % "18.0-dt-20220922Z-fc8273",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-3fbb8c",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
