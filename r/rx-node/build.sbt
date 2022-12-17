organization := "org.scalablytyped"
name := "rx-node"
version := "0.0-unknown-dt-20220818Z-45a605"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20220818Z-5fdb06",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20220818Z-d5b2ae",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20220818Z-503950",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
