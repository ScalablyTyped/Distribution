organization := "org.scalablytyped"
name := "rx-node"
version := "0.0-unknown-dt-20220818Z-ede658"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221018Z-1e532a",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20220818Z-d1c6ba",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20220818Z-52bce7",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20220818Z-37421d",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
