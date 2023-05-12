organization := "org.scalablytyped"
name := "read-pkg-up"
version := "9.1.0-6711a8"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20211202Z-9e9ab1",
  "org.scalablytyped" %%% "read-pkg" % "8.0.0-1fcbe2",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "type-fest" % "3.10.0-9a1e17")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
