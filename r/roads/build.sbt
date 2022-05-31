organization := "org.scalablytyped"
name := "roads"
version := "6.3.1-0c9ded"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "babel-core" % "6.25-dt-20200226Z-0dc5a7",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20200515Z-391301",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20200226Z-cf4d86",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20200515Z-29b3d2",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20200902Z-a84816",
  "org.scalablytyped" %%% "babelify" % "v7.3.0-dt-20200923Z-120230",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20200226Z-8dc468",
  "org.scalablytyped" %%% "browserify" % "12.0-dt-20200923Z-347ac6",
  "org.scalablytyped" %%% "cookie" % "0.4-dt-20200513Z-8d9be8",
  "org.scalablytyped" %%% "insert-module-globals" % "7.0-dt-20200515Z-546dc4",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-11c649",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
