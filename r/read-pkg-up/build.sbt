organization := "org.scalablytyped"
name := "read-pkg-up"
version := "9.1.0-17bf50"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "normalize-package-data" % "2.4-dt-20211202Z-5df6da",
  "org.scalablytyped" %%% "read-pkg" % "7.1.0-2c8ede",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "type-fest" % "3.1.0-4b2f46")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
