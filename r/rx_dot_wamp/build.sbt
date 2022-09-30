organization := "org.scalablytyped"
name := "rx_dot_wamp"
version := "0.5.0-dt-20220818Z-c4a862"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "autobahn" % "20.9-dt-20220913Z-67157e",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20220818Z-452c8d",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20220818Z-f7d904",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20220818Z-3b1a00",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "when" % "2.4.0-dt-20220818Z-b385a4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
