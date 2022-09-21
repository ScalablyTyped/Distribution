organization := "org.scalablytyped"
name := "rx"
version := "4.1-dt-20220818Z-14d6df"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20220818Z-a1cc09",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20220818Z-93f85a",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20220818Z-5bfac6",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20220818Z-c1505f",
  "org.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20211202Z-bcd76b",
  "org.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20211202Z-484cc0",
  "org.scalablytyped" %%% "rx-lite-coincidence" % "4.0-dt-20220818Z-5e0bf5",
  "org.scalablytyped" %%% "rx-lite-experimental" % "4.0-dt-20211202Z-066b0a",
  "org.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20211202Z-2ee06d",
  "org.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20211202Z-0a3314",
  "org.scalablytyped" %%% "rx-lite-time" % "4.0-dt-20220818Z-e1dc64",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20220818Z-46c5f8",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
