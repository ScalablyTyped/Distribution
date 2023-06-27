organization := "org.scalablytyped"
name := "read-pkg-up"
version := "9.1.0-3fb2d1"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20211202Z-adbd0b",
  "org.scalablytyped" %%% "read-pkg" % "8.0.0-d6ec33",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2",
  "org.scalablytyped" %%% "type-fest" % "3.12.0-be920d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
