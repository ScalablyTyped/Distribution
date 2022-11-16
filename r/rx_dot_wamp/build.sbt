organization := "org.scalablytyped"
name := "rx_dot_wamp"
version := "0.5.0-dt-20220818Z-1489d1"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "autobahn" % "20.9-dt-20220913Z-9af26a",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20220818Z-5c29f5",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20220818Z-1fcb16",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20220818Z-f23ef0",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "when" % "2.4.0-dt-20220818Z-4cd58c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
