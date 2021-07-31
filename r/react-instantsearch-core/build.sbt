organization := "org.scalablytyped"
name := "react-instantsearch-core"
version := "6.3-dt-20200911Z-7e94f5"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "algolia__cache-common" % "4.8.0-141b1e",
  "org.scalablytyped" %%% "algolia__client-analytics" % "4.8.0-6fb6db",
  "org.scalablytyped" %%% "algolia__client-common" % "4.8.0-3fcf34",
  "org.scalablytyped" %%% "algolia__client-recommendation" % "4.8.0-efe1ea",
  "org.scalablytyped" %%% "algolia__client-search" % "4.8.0-c34811",
  "org.scalablytyped" %%% "algolia__logger-common" % "4.8.0-6196c1",
  "org.scalablytyped" %%% "algolia__requester-common" % "4.8.0-4f09db",
  "org.scalablytyped" %%% "algolia__transporter" % "4.8.0-90b6d0",
  "org.scalablytyped" %%% "algoliasearch" % "4.8.0-869f9f",
  "org.scalablytyped" %%% "algoliasearch-helper" % "3.3.2-78e4c2",
  "org.scalablytyped" %%% "csstype" % "2.6.14-b8d190",
  "org.scalablytyped" %%% "events" % "3.0-dt-20200515Z-8deb1a",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-a12f9a",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-c80121",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
