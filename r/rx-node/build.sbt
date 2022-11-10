organization := "org.scalablytyped"
name := "rx-node"
version := "0.0-unknown-dt-20220818Z-5165d7"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20220818Z-fe6aef",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20220818Z-e91e87",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20220818Z-3f0561",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
