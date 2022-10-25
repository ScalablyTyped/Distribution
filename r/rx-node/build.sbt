organization := "org.scalablytyped"
name := "rx-node"
version := "0.0-unknown-dt-20220818Z-1ee2fe"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221024Z-2be228",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20220818Z-672fd6",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20220818Z-c3d302",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20220818Z-708e57",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
