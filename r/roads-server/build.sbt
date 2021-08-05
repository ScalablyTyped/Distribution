organization := "org.scalablytyped"
name := "roads-server"
version := "1.0.3-76c170"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "babel-core" % "6.25-dt-20200226Z-b81437",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20200515Z-31798b",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20200226Z-f1ce9e",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20200515Z-fac8c9",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20200902Z-5d5832",
  "org.scalablytyped" %%% "babelify" % "v7.3.0-dt-20200923Z-7099be",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20200226Z-6548f2",
  "org.scalablytyped" %%% "browserify" % "12.0-dt-20200923Z-8c8de9",
  "org.scalablytyped" %%% "cookie" % "0.4-dt-20200513Z-e4453f",
  "org.scalablytyped" %%% "insert-module-globals" % "7.0-dt-20200515Z-f4d8e7",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "roads" % "6.3.1-6dbcdb",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
