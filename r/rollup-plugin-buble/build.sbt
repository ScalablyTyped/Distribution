organization := "org.scalablytyped"
name := "rollup-plugin-buble"
version := "0.19-dt-20211202Z-b8ebd7"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "buble" % "0.20-dt-20211202Z-1892a7",
  "org.scalablytyped" %%% "magic-string" % "0.26.7-dba250",
  "org.scalablytyped" %%% "rollup" % "3.3.0-76f060",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
