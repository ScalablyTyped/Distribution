organization := "org.scalablytyped"
name := "rdfjs__fetch"
version := "2.0-dt-20200925Z-e1b25d"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "rdf-js" % "4.0-dt-20201002Z-986842",
  "org.scalablytyped" %%% "rdfjs__fetch-lite" % "2.0-dt-20200925Z-7f1d5c",
  "org.scalablytyped" %%% "rdfjs__sink-map" % "1.0-dt-20200925Z-cdf2fc",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
