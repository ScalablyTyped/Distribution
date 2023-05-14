organization := "org.scalablytyped"
name := "rx-node"
version := "0.0-unknown-dt-20230418Z-6d7f09"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20230322Z-58cd9a",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20230322Z-703d66",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20230322Z-9914e9",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
