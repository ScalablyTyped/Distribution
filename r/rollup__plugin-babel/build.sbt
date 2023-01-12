organization := "org.scalablytyped"
name := "rollup__plugin-babel"
version := "6.0.2-4f7f69"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "babel__core" % "7.1-dt-20221107Z-5b3929",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20211223Z-5fc152",
  "org.scalablytyped" %%% "babel__parser" % "7.20.3-0ceec3",
  "org.scalablytyped" %%% "babel__template" % "7.4-dt-20211202Z-10b9d5",
  "org.scalablytyped" %%% "babel__traverse" % "7.18-dt-20220923Z-b27c06",
  "org.scalablytyped" %%% "babel__types" % "7.20.2-0db274",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-6dfb17",
  "org.scalablytyped" %%% "rollup" % "3.3.0-76f060",
  "org.scalablytyped" %%% "rollup__pluginutils" % "5.0.2-8d8c58",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
