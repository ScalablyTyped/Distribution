organization := "org.scalablytyped"
name := "rx-dom"
version := "7.0-dt-20211202Z-45a515"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20220818Z-452c8d",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20220818Z-107e42",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20220818Z-f7d904",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20220818Z-3b1a00",
  "org.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20211202Z-ffff2a",
  "org.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20211202Z-473d33",
  "org.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20211202Z-2ee06d",
  "org.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20211202Z-01c9e4",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20220818Z-5ff5b3",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
