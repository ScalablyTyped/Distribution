organization := "org.scalablytyped"
name := "rollup-plugin-buble"
version := "0.19-dt-20211202Z-d12234"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "buble" % "0.20-dt-20211202Z-98af69",
  "org.scalablytyped" %%% "magic-string" % "0.30.0-c7f539",
  "org.scalablytyped" %%% "rollup" % "3.21.7-e69163",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
