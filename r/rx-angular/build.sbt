organization := "org.scalablytyped"
name := "rx-angular"
version := "0.0-unknown-dt-20221103Z-3853e1"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "angular" % "1.8-dt-20220525Z-1b81ed",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20220818Z-81d923",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20220818Z-c1f07d",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20220818Z-f219bc",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
