organization := "org.scalablytyped"
name := "rx_dot_wamp"
version := "0.5.0-dt-20220818Z-ce314f"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "autobahn" % "20.9-dt-20220913Z-a37acc",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20220818Z-5fdb06",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20220818Z-d5b2ae",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20220818Z-503950",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "when" % "2.4.0-dt-20220818Z-3218f7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
