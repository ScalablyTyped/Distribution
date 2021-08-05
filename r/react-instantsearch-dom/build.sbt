organization := "org.scalablytyped"
name := "react-instantsearch-dom"
version := "6.3-dt-20200515Z-28d34a"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "algolia__cache-common" % "4.8.0-4400d2",
  "org.scalablytyped" %%% "algolia__client-analytics" % "4.8.0-146edb",
  "org.scalablytyped" %%% "algolia__client-common" % "4.8.0-334459",
  "org.scalablytyped" %%% "algolia__client-recommendation" % "4.8.0-3d7a17",
  "org.scalablytyped" %%% "algolia__client-search" % "4.8.0-9ac983",
  "org.scalablytyped" %%% "algolia__logger-common" % "4.8.0-6649aa",
  "org.scalablytyped" %%% "algolia__requester-common" % "4.8.0-7d6782",
  "org.scalablytyped" %%% "algolia__transporter" % "4.8.0-f2c99d",
  "org.scalablytyped" %%% "algoliasearch" % "4.8.0-4b5547",
  "org.scalablytyped" %%% "algoliasearch-helper" % "3.3.2-23e135",
  "org.scalablytyped" %%% "csstype" % "2.6.14-344a29",
  "org.scalablytyped" %%% "events" % "3.0-dt-20200515Z-0cdbcd",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-49dd4c",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-76d083",
  "org.scalablytyped" %%% "react-instantsearch-core" % "6.3-dt-20200911Z-2d1057",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
